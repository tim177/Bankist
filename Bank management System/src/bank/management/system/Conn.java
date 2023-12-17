package bank.management.system;

import java.sql.*;

public class Conn {
    
    //STEP4: EXECUTE QUERY
    //STEP5: CLOSE CONNECTION
    Connection c;
    Statement s;
    public Conn(){
        try{
         //STEP!: REGISTER THE DRIVER
         //No need to register this the java will pick it automatically from class path 
         //Class.forName(com.mysql.cj.jdbc.Driver);
        
        //STEP2: CREATE CONNECTION
        c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "qwertyuiop");
        
        //STEP3: CREATE STATEMENT
        s = c.createStatement();
        
        
        }catch(Exception e){
           System.out.println(e);
        }
    }
    
}
