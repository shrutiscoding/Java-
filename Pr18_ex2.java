import java.sql.*;
class Pr18_ex2
{
 public static void main(String args[])
 {
  try
  {
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
   System.out.println("Connection successful");
   Statement s=con.createStatement();
   ResultSet rs=s.executeQuery("select roll_no,name from student_record where (percentage>70.0)");
   System.out.println("Query successful");
   System.out.println("ROLL_NO\tNAME");
  System.out.println("===================");
   while(rs.next()){
           System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
          
         }
		 System.out.println("Displayed");
	con.close();
   }
   catch(Exception e)
   {
    System.out.println(e);
   }
  }
}