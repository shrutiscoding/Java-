import java.sql.*;  
import java.util.*;

class Department_detail_cmd
{  
	public static void main(String args[])
	{  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");  
  
		PreparedStatement stmt=con.prepareStatement("insert into dept values(?,?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID of Department:");
		int id=sc.nextInt();
		System.out.println("Enter Name of Department:");
		String name=sc.next();
		System.out.println("Enter HOD Name:");
		String hod=sc.next();
		System.out.println("Enter CR Name:");
		String cr=sc.next();
		System.out.println("Enter Year:");
		int year=sc.nextInt();
		
	   stmt.setInt(1,id);//1 specifies the first parameter in the query  
       stmt.setString(2,name);
		stmt.setString(3,hod);
		stmt.setString(4,cr);	   
		stmt.setInt(5,year);
  
			int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
  
	con.close();  
  
}
catch(Exception e)
{ System.out.println(e);}  
  
}  
}  