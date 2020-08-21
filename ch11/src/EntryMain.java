import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.ibatis.io.Resources;

public class EntryMain {
	
    public static void main(String[] args) {
    	
        String resource = "config/DB.properties";
        Properties properties = new Properties();
        
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            properties.load(reader);
            System.out.println(properties.getProperty("driver"));
            System.out.println(properties.getProperty("username"));
            System.out.println(properties.getProperty("password"));
            System.out.println(properties.getProperty("url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}