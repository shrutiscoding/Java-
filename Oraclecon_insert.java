import java.sql.*;
class Oraclecon_insert
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Registered Successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
		System.out.println("Connection Established Successfully");
		
		Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into student values(3,'Virat')");
		System.out.println("Row inserted successfully");
		con.close();
	}
}