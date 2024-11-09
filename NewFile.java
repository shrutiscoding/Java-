import java.net.*;
import java.io.*;

public class NewFile
{
 public static void main(String args[])
 {
  try
  {
	  int port=123;
            DatagramSocket cs = new DatagramSocket(port);
            System.out.println("Server is running and listening on port " + port);

            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            cs.receive(receivePacket);
			
            String old = new String(receivePacket.getData(), 0, receivePacket.getLength());

            cs.receive(receivePacket);
            String newf = new String(receivePacket.getData(), 0, receivePacket.getLength());

            File oldFile = new File(old); 
            File newFile = new File(newf);
			
			if(oldFile.exists())
			{
				if(oldFile.renameTo(newFile))
				{
					System.out.println("File renamed successfully");
				}
				else
				{
					System.out.println("Failed to rename");
				}
			}
			else{
				System.out.println("Source file does not exist");
			}
            cs.close();
        } catch (Exception e) {
            System.out.println(e);
  }
 }
}