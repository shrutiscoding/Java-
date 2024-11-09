import java.sql.*;
class Pr20_ex1
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Registered Successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
		System.out.println("Connection Established Successfully");
		
		Statement stmt=con.createStatement();
		stmt.executeUpdate("update student set name='John' where (name='Jack')");
		System.out.println("Row Updated successfully");
		con.close();
	}
}