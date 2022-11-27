
package bank.management.syatem;
//http://localhost/phpmyadmin/index.php?route=/table/sql&db=bankmanagementsystem&table=signup
import com.mysql.cj.Query;
import java.sql.*;  
public class connection_t{  

    private static String rs;
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","");  
//here sonoo is database name, root is username and password  
Statement s=c.createStatement();  
   int m = s.executeUpdate(rs);
    if (m==1)
        System.out.println("inserted successfully : "+rs);
    else
    System.out.println("insertion failed");
c.close();  
}catch(Exception e){ System.out.println(e);}
}
    Object s;

    com.mysql.cj.xdevapi.Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void executeUpdate(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    ResultSet executeQuery(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
  

   