import java.net.*;
import java.io.*;

public class ServerEven
{
    public static void main(String[] args) 
	{
        try 
		{
            ServerSocket ss = new ServerSocket(100);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            Integer n = Integer.parseInt((String)din.readUTF());        
			if(n%2==0)
			{      
			  System.out.println(n+" is even number");
			}	
			else  
		    {
			  System.out.println(n+" is odd number"); 
		    } 
			s.close();
			ss.close();
	    }
        catch (Exception e) 
		{
            System.out.println(e);
        }
    }

}
