import java.net.*;
class Pr15_ex1
{
	public static void main(String args[]) throws MalformedURLException
	{
		URL u = new URL("http://www.msbte.org.in");
		System.out.println("Protocol: " + u.getProtocol());
		System.out.println("Port: " + u.getPort());
		System.out.println("Host: " + u.getHost());
		System.out.println("File: " + u.getFile());
	}
}