package ch15;

import java.io.*;
import java.io.FileReader;

public class FileStream {
	
	/** 디렉토리 생성*/
	 public void File_Mkdir() {
		String path = "C:\\Users\\lenovo\\eclipse-workspace\\javajungsuk_basic_src\\ch15\\src\\ch15\\새폴더"; //폴더 경로
		File Folder = new File(path);

		// 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
		if (!Folder.exists()) {
			try{
			    Folder.mkdir(); //폴더 생성합니다.
			    System.out.println("폴더가 생성되었습니다.");
		        } 
		        catch(Exception e){
			    e.getStackTrace();
			}        
	         }else {
			System.out.println("이미 폴더가 생성되어 있습니다.");
		}
	}
	 
	 /** 디렉토리 삭제*/
	public void File_dirDelete(String pathIn) {		

		String path = "C:\\Users\\lenovo\\eclipse-workspace\\javajungsuk_basic_src\\ch15\\src\\ch15\\새폴더";
		File_dirDelete(path);

		File folder = new File(path);
		try {
			if (folder.exists()) {
				File[] folder_list = folder.listFiles(); // 파일리스트 얻어오기

				for (int i = 0; i < folder_list.length; i++) {
					if (folder_list[i].isFile()) {
						folder_list[i].delete();
						System.out.println("파일이 삭제되었습니다.");
					} else {
						File_dirDelete(folder_list[i].getPath()); // 재귀함수호출
						System.out.println("폴더가 삭제되었습니다.");
					}
					folder_list[i].delete();
				}
				folder.delete(); // 폴더 삭제
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	/** 파일 쓰기*/
	public void File_Write() {
		try {
			FileReader fr = new FileReader("Ex15_11.java");
//	    이클립스에서는 윗 줄 대신 아래 줄 입력
//	 		FileReader fr = new FileReader(".\\src\\Ex15_11.java");
			BufferedReader br = new BufferedReader(fr);

			String line = "";
			for (int i = 1; (line = br.readLine()) != null; i++) {
				// ";"를 포함한 라인을 출력한다.
				if (line.indexOf(";") != -1)
					System.out.println(i + ":" + line);
			}

			br.close();
		} catch (IOException e) {
		}
	} // main
	
		
	
}
