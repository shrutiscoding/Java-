import java.net.*;
import java.io.*;
public class ServerPrime 
{
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(100);
            System.out.println("Server is running and waiting for checking validation of prime number...");
                Socket s = ss.accept();
                DataInputStream din = new DataInputStream(s.getInputStream());                
                Integer n = Integer.parseInt((String)din.readUTF());
                int flag=0;
                int m;
				m=n/2;      
			  if(n==0||n==1)
			  {  
			   System.out.println(n+" is not prime number");      
			  }
			  else
			  {  
				   for(int i=2;i<=m;i++)
				   {      
					if(n%i==0)
					{      
					 System.out.println(n+" is not prime number");      
					 flag=1;      
					 break;      
					}      
				   }      
				   if(flag==0)  
				   {
					 System.out.println(n+" is prime number"); 
				   }  
			  }
                s.close();
                ss.close();
            }
         catch (Exception e) {
            System.out.println(e);
        }
    }

}
