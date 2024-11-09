import java.sql.*;
class Pr18_ex1
{
 public static void main(String args[])
 {
  try
  {
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
   System.out.println("Connection successful");
   Statement s=con.createStatement();
   ResultSet rs=s.executeQuery("create table employee (emp_id number(3),emp_name varchar(30))");
   System.out.println("Query successful");
	con.close();	
   }
   catch(Exception e)
   {
    System.out.println(e);
   }
  }
}