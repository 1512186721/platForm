package cn.com.applets.user;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	public static void main(String args[])  
    {  
          
//            String url = "jdbc:mysql://localhost/test";  
			String url = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf-8";
            String driver = "com.mysql.jdbc.Driver";  
            try{  
                Class.forName(driver);  
            }catch(Exception e){  
                System.out.println("无法加载驱动");  
            }  
              
    try {  
            Connection con = DriverManager.getConnection(url,"root","root");  
            if(!con.isClosed())  
                System.out.println("success");  
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  

}
