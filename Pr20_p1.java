import java.sql.*;
class Pr20_p1
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Registered Successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
		System.out.println("Connection Established Successfully");
		
		Statement stmt=con.createStatement();
		stmt.executeUpdate("delete from student_record where roll_no=22140");
		System.out.println("Row Deleted successfully");
		con.close();
	}
}