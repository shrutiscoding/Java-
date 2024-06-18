import java.net.*;
import java.io.*;

class ClientEven {
    public static void main(String args[])
	{
        try 
		{
            Socket s = new Socket("localhost", 100); // Connect to a server on port 100
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
			BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Number:");
            String n = b1.readLine();

            dout.writeUTF(n);  
            dout.flush();
            dout.close();
            s.close();
        }
		catch (Exception e) 
		{
            System.out.println(e);
        }
    }
}
