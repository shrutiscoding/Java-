import java.sql.*;  
class Pr19_p1
{  
	public static void main(String args[])
	{  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MSBTE","root","");  
  
		PreparedStatement stmt=con.prepareStatement("update student set name=? where id=?");  
		stmt.setString(1,"Samiksha");//1 specifies the first parameter in the query i.e. name  
		stmt.setInt(2,1);  
  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated");  
  
		con.close();  
  
}
catch(Exception e)
{ System.out.println(e);}  
  
}  
}  