import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.Paths;

public class FileTransfer {
    public static void main(String[] args) {
        int port = 12345; // Port to listen on

        try {
            DatagramSocket serverSocket = new DatagramSocket(port);
            System.out.println("Server is running and listening on port " + port);

            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            serverSocket.receive(receivePacket);
            String sourceFilePath = new String(receivePacket.getData(), 0, receivePacket.getLength());

            serverSocket.receive(receivePacket);
            String targetFilePath = new String(receivePacket.getData(), 0, receivePacket.getLength());

            Path sourcePath = Paths.get(sourceFilePath); 
            Path targetPath = Paths.get(targetFilePath);

            if (Files.exists(sourcePath)) {
                Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
				
                System.out.println("File moved successfully!");
            } else {
                System.out.println("Source file or Destination file does not exist.");
            }

            serverSocket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
