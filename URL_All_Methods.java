import java.net.*;
class URL_All_Methods
{
	public static void main(String args[]) throws MalformedURLException
	{
		URL hp = new URL("https://docs.oracle.com/javase/8/docs/api/index.html");
		System.out.println("Protocol: " + hp.getProtocol());
		System.out.println("Port: " + hp.getPort());
		System.out.println("Host: " + hp.getHost());
		System.out.println("File: " + hp.getFile());
		System.out.println("Ext:" + hp.toExternalForm());
		System.out.println("Authority:" + hp.getAuthority());
		System.out.println("Default Port: " + hp.getDefaultPort());
		System.out.println("Path: " + hp.getPath());
		System.out.println("Query: " + hp.getQuery());
	}
}