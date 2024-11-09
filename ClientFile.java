import java.net.*;
import java.io.*;

public class ClientFile {
    public static void main(String args[]) throws Exception {
        byte b[] = new byte[1024];

        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter File name for sending Contents:");
        String file = b1.readLine();

        FileInputStream f = new FileInputStream(file);

        DatagramSocket dsoc = new DatagramSocket();

        int i = 0;
        while (f.available() != 0) {
            b[i] = (byte) f.read();
            i++;
        }

        DatagramPacket d = new DatagramPacket(b, i, InetAddress.getLocalHost(), 100);
        dsoc.send(d);

        f.close();

        System.out.println("File copied successfully.");
    }
}

 