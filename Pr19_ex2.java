import java.sql.*;
class Pr19_ex2
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Registered Successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
		
		PreparedStatement stmt=con.prepareStatement("update employee set emp_name=? where emp_id=?");  
		stmt.setString(1,"Samiksha");
		stmt.setInt(2,1);  
  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated");  

		con.close();
	}
}