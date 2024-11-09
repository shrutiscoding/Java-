import java.sql.*;
class Pr18_p1
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Registered Successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
		System.out.println("Connection Established Successfully");
		
		Statement stmt=con.createStatement();
		ResultSet rs1=stmt.executeQuery("select *from employee");
		System.out.println("Before Inserting Table");
		System.out.println("ROLLNO\tNAME");
        System.out.println("===================");
        while(rs1.next()){
           System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2));
          
         }
		 System.out.println("\n");
		stmt.executeUpdate("insert into employee values(1,'Dipti')");
		System.out.println("Row inserted successfully");
		ResultSet rs2=stmt.executeQuery("select *from employee");
		System.out.println("\nAfter Inserting Table");
		System.out.println("ROLLNO\tNAME");
        System.out.println("===================");
        while(rs2.next()){
           System.out.println(rs2.getInt(1)+"\t"+rs2.getString(2));
          
         }
		con.close();
	}
}