package com.yi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//import oracle.jdbc.OracleCallableStatement;
//import oracle.jdbc.OracleTypes;
//import oracle.jdbc.oracore.OracleType;
 
public class TB_MemberDAO {
	
    private static Connection conn;
    private PreparedStatement pstmt;
    private Statement stmt;
    private ResultSet rs;
   
    //기본생성자
    public TB_MemberDAO() { }
       
    private void getConnection() throws ClassNotFoundException, SQLException{
        if(conn == null){ //dbConn이 null이면 Connection 객체 얻어오기..
            //접속정보
            String url = "jdbc:mysql://localhost/MemberSQL";
            String user = "root";
            String pw = "1234";
           
            //JDBC드라이버 로드
            Class.forName("com.mysql.jdbc.Driver");
           
            //(DBMS)에 연결하여 Connection 객체 얻기.
            conn = DriverManager.getConnection(url,"root","1234");                    
        }
    }
   
    /** 회원 등록하기 */
    public int insertMember(TB_MemberDTO dto){
       
        int result=500; //내부 오류
       
        try {
            getConnection();
            
            String sql = "INSERT INTO TB_Member(m_no, m_name, m_date, m_phoneNum, m_addr) VALUES (?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1,dto.getM_no());
            pstmt.setString(2,dto.getM_name());
            pstmt.setString(3,dto.getM_date());
            pstmt.setString(4,dto.getM_phoneNum());
            pstmt.setString(5,dto.getM_addr());

            int count = pstmt.executeUpdate();
            
            if (count == 0) {
            	System.out.println("입력 실패");
            } else {
            	System.out.println("입력 성공");
            	result = 200;
            }
            
            
        } catch (Exception e) {        
            System.out.println("예외발생:insertMember()=> "+e.getMessage());
        }finally{          
            dbClose();
        }      
        return result;
    }
   
    /** 회원번호에 해당하는 회원정보 보기*/
    public TB_MemberDTO getMember(String no){
    	TB_MemberDTO dto =null;
    	
        try {
            getConnection();
            
            String sql = "select * from tb_member where m_no = '"+no+"'"; 
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
           
            while(rs.next()) {
            	
                String m_no = rs.getString("m_no");
                String m_name = rs.getString("m_name");
                String m_date = rs.getString("m_date");
                String m_phoneNum = rs.getString("m_phoneNum");
                String m_addr = rs.getString("m_addr");
                dto = new TB_MemberDTO(m_no, m_name, m_date, m_phoneNum, m_addr);
            }
           
        } catch (Exception e) {
            System.out.println("예외발생:deleteMember()=> "+e.getMessage());
        }finally{          
            dbClose();
        }      
        return dto;
    }
 
    /** 저장된 회원 목록 보기 */
    public List<TB_MemberDTO> getMemberList(){
        List<TB_MemberDTO> list = new ArrayList<TB_MemberDTO>();
       
        try {
            getConnection();
           
            String sql = "select * from TB_Member";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);           
            while(rs.next()) {
            	
                 String m_no = rs.getString("m_no");
                 String m_name = rs.getString("m_name");
                 String m_date = rs.getString("m_date");
                 String m_phoneNum = rs.getString("m_phoneNum");
                 String m_addr = rs.getString("m_addr");
                list.add(new TB_MemberDTO(m_no, m_name, m_date, m_phoneNum, m_addr));
                
            }
           
        } catch (Exception e) {
            System.out.println("예외발생:getMemberList()=> "+e.getMessage());
        }finally{          
            dbClose();
        }  
        return list;
    }
   
    /** 회원 수정 */
    public boolean updateMember(TB_MemberDTO dto){
       
        boolean result = false;            
        try {
            getConnection();
           
            String sql = "update TB_Member set m_name =?, m_date= ?, m_phoneNum=?, m_addr=? where m_no = ?";
            pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1,dto.getM_name());
            pstmt.setString(2,dto.getM_date());
            pstmt.setString(3,dto.getM_phoneNum());
            pstmt.setString(4,dto.getM_addr());
            pstmt.setString(5,dto.getM_no());
            
            int count = pstmt.executeUpdate();
            if (count == 0 ) {
            	System.out.println("실패");
            } else {
            	result = true;
            }
           
        } catch (Exception e) {
            System.out.println("예외발생:updateMember()=> "+e.getMessage());
            e.printStackTrace();
        }finally{          
            dbClose();
        }      
        return result;
    }
   
   
    /** 회원 삭제 */
    public boolean deleteMember(String m_no){        
        boolean result = false;            
        try {
            getConnection();
           
            String sql = "delete from TB_Member where m_no=?";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, m_no);
           
            int count = pstmt.executeUpdate();
            if (count == 0) {
            	System.out.println("실패");
            } else {
            	result = true;
            }
            
        } catch (Exception e) {
            System.out.println("예외발생:deleteMember()=> "+e.getMessage());
        }finally{          
            dbClose();
        }      
        return result;
    }//deleteMember()--------------
   
   
    /** DB연결 해제(닫기)*/
    public void dbClose(){      
     
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                System.out.println("예외:ResultSet객체 close():" + e.getMessage());
            }
        }
         
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                System.out.println("예외:PreparedStatement객체 close():" + e.getMessage());
            }
        }
       
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                System.out.println("예외:Statement객체 close():" + e.getMessage());
            }
        }      
       
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("예외:Connection객체 close():" + e.getMessage());
            }
        }    
         
        conn = null;        
    }//dbClose()---------
}