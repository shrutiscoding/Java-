import java.io.*;
import java.net.*;
import java.util.*;
class InetFactory 
{
	public static void main(String[] args) throws UnknownHostException
	{
		// To get and print InetAddress of Local Host
		InetAddress address1 = InetAddress.getLocalHost();
		System.out.println("InetAddress of Local Host : " + address1);
		System.out.print("\n");
		// To get and print InetAddress of Named Host
		InetAddress address2 = InetAddress.getByName("157.240.16.35");
		System.out.println("InetAddress of Named Host : " + address2);
		System.out.print("\n");
		// To get and print ALL InetAddresses of Named Host
		InetAddress address3[] = InetAddress.getAllByName("www.nda.com");
		System.out.println("ALL InetAddresses of Named Host : ");
		for (int i = 0; i < address3.length; i++)
		{
			System.out.print((i+1)+")"+address3[i]);
			System.out.print("\n");
		}
		System.out.print("\n");
		// To get and print InetAddresses of Host with specified IP Address
		byte IPAddress[] = { (byte)157,(byte)240,16,(byte)174 };
		InetAddress address4 = InetAddress.getByAddress(IPAddress);
		System.out.println( "InetAddresses of Host with specified IP Address : " + address4);
		System.out.print("\n");
		// To get and print InetAddresses of Host with specified IP Address and hostname
		byte[] IPAddress2 = { (byte)199,59,(byte)243,(byte)225 };
		InetAddress address5 = InetAddress.getByAddress( "tutorialpoint.com", IPAddress2);
		System.out.println( "InetAddresses of Host with specified IP Address and hostname : " +address5);
	}
}