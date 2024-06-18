import java.io.*;
import java.net.*;
public class Inet_Example
{
 public static void main(String[] args)
 {
   try
   {
   System.out.println("Using getByName Method");
	InetAddress ip1=InetAddress.getByName("www.grwptasgaon.ac.in");
	System.out.println("Host Name: "+ip1.getHostName());
	System.out.println("IP Address: "+ip1.getHostAddress());
	
	System.out.println("\n\nUsing getLocalHost Method");
	InetAddress ip2=InetAddress.getLocalHost();
	System.out.println("Host Name: "+ip2.getHostName());
	System.out.println("IP Address: "+ip2.getHostAddress());
   }
   catch(Exception e)
   {
     System.out.println(e);
   }
 }
}