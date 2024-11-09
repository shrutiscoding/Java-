import java.sql.*;
class Pr20_ex2
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Registered Successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
		System.out.println("Connection Established Successfully");
		
		Statement stmt=con.createStatement();
		stmt.executeUpdate("delete from product where (price>500 And p_id='P1234')");
		System.out.println("Rows Deleted successfully");
		con.close();
	}
}