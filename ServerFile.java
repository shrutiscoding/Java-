import java.net.*;
import java.io.*;

public class ServerFile {
    public static void main(String args[]) throws IOException {
        byte b[] = new byte[1024];

        System.out.println("Server is running...");
        DatagramSocket dsoc = new DatagramSocket(100);

        DatagramPacket dp = new DatagramPacket(b, b.length);
        dsoc.receive(dp);
		BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter File name for sending Contents:");
        String filen = b1.readLine();
        String file = filen ;
        FileOutputStream f = new FileOutputStream(file);

        f.write(dp.getData(), 0, dp.getLength());
        f.close();

        System.out.println("File received and pasted to " + file);
    }
}
