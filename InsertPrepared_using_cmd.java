import java.sql.*;  
import java.util.*;

class InsertPrepared_using_cmd
{  
	public static void main(String args[])
	{  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");  
  
		PreparedStatement stmt=con.prepareStatement("insert into student values(?,?)");  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No of Student:");
		int rno=sc.nextInt();
		System.out.println("Enter Name of Student:");
		String name=sc.next();
		
	stmt.setInt(1,rno);//1 specifies the first parameter in the query  
	stmt.setString(2,name);  
  
			int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
  
	con.close();  
  
}
catch(Exception e)
{ System.out.println(e);}  
  
}  
}  