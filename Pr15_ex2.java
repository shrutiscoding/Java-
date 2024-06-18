import java.net.*;
import java.util.*;
 
public class Pr15_ex2 
{
    public static void main(String[] args) 
    {
		try
		{
			Scanner sc = new Scanner(System.in);
	 
			System.out.print("Enter any Url: ");
			String ad = sc.nextLine();
	 
			URL url = new URL(ad);
			URLConnection uc = url.openConnection();
	 
			System.out.println("Date:"+ new Date(uc.getDate()) );
			System.out.println("Content Type: "+ uc.getContentType());
			System.out.println("Content Length: "+ uc.getContentLength());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
         
    }
}
//https://docs.oracle.com/javase/8/docs/api/java/net/URLConnection.html