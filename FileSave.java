import java.io.*;
import java.net.*;

public class FileSave {
    public static void main(String[] args) {
        int port = 12345; // Port to send the move request

        try {
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");

            BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter File path:");
            String s1 = b1.readLine();

            BufferedReader b2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter File path where file is to move:");
            String s2 = b2.readLine();

            String sourceFilePath = s1;
            String targetFilePath = s2;

            byte[] sourceData = sourceFilePath.getBytes();
            DatagramPacket sourcePacket = new DatagramPacket(sourceData, sourceData.length, serverAddress, port);
            clientSocket.send(sourcePacket);

            byte[] targetData = targetFilePath.getBytes();
            DatagramPacket targetPacket = new DatagramPacket(targetData, targetData.length, serverAddress, port);
            clientSocket.send(targetPacket);

            clientSocket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
