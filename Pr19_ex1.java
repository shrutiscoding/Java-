import java.sql.*;
class Pr19_ex1
{
 public static void main(String args[])
 {
  try
  {
   Class.forName("oracle.jdbc.driver.OracleDriver");
   
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
   System.out.println("Connection successful");
		 PreparedStatement stmt=con.prepareStatement("select * from student_record");  
		ResultSet rs=stmt.executeQuery();  
		System.out.println("ROLLNO\tNAME\tPERCENTAGE");
      System.out.println("===================");
      while(rs.next()){
           System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
          
         }
  
		con.close();  
   }
   catch(Exception e)
   {
    System.out.println(e);
   }
  }
}
