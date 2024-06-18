import java.net.*;
import java.io.*;

public class ServerAuth 
{
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(100);

            System.out.println("Server is running and waiting for client authentication...");
                Socket s = ss.accept();

                
                DataInputStream din = new DataInputStream(s.getInputStream());

                
                String username = (String)din.readUTF();
                String password = (String)din.readUTF();

                
                if (username.equals("Shruti") && password.equals("123456"))
				{
                    System.out.println("Authentication successful for user: " + username);
                } else 
				{
                    System.out.println("Authentication failed for user: " + username);
                }

                s.close();
                ss.close();
            }
         catch (Exception e) {
            System.out.println(e);
        }
    }

}
