
package login;
import java.sql.*;
public class DAO
{
    
    Connection con;
    Statement st;
    DAO()
    {
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "barry", "barry");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
            
            
        }
        
       
        
}
 public boolean insertPhoneBook(String name,String dob,String gender,String mailid, String mobile,String address, String photo)
                
    {   
        String sql="insert into ";
            return true;
            
            
    }
}