import java.sql.*;

class Oraclecon
{
 public static void main(String args[])
 {
  try
  {
   //Step 1 Load the Driver Class
   Class.forName("oracle.jdbc.driver.OracleDriver");
   
   //Step 2 Create the connection object
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
   System.out.println("Connection successful");
   
   
   //Step 3 Create the statement object
   Statement s=con.createStatement();
   
   //Step 4 Execute Query
   ResultSet rs=s.executeQuery("select *from student");
   System.out.println("Query successful");
  System.out.println("ROLLNO\tNAME");
  System.out.println("===================");
   while(rs.next()){
           System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
          
         }
		// System.out.println("Displayed");
   
	//Step 5 Close the connection object
	con.close();
   }
   catch(Exception e)
   {
    System.out.println(e);
   }
  }
}
