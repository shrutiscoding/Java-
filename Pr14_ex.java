import java.io.*;
import java.net.*;
import java.util.*;
public class Pr14_ex
{
 public static void main(String[] args)
 {
   try
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Host Name:");
	   String hostname=sc.next();
	InetAddress ip1=InetAddress.getByName(hostname);
	System.out.println("IP Address of Host Name: "+ip1.getHostAddress());
	}
   catch(Exception e)
   {
     System.out.println(e);
   }
 }
}