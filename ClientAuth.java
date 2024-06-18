import java.net.*;
import java.io.*;

class ClientAuth {
    public static void main(String args[]) {
        try {
            Socket s = new Socket("localhost", 100); // Connect to a server on port 100
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

           
            BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Username:");
            String username = b1.readLine();

            BufferedReader b2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Password:");
            String password = b2.readLine();

            
            dout.writeUTF(username);
            dout.writeUTF(password);
            dout.flush();

            
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
