import java.sql.*;  
class DeletePrepared
{  
	public static void main(String args[])
	{  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");  
  
		PreparedStatement stmt=con.prepareStatement("delete from student where rno=?");  
		stmt.setInt(1,101);  
  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records deleted");  
  
		con.close();  
  
}
catch(Exception e)
{ System.out.println(e);}  
  
}  
}  