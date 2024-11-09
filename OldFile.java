import java.net.*;
import java.io.*;

public class OldFile
{
 public static void main(String args[])
 {
  try
  {
	  int port=123;
   DatagramSocket cs=new DatagramSocket();
   InetAddress s=InetAddress.getByName("localhost");
   BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter File name rename:");
            String s1 = b1.readLine();

            BufferedReader b2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter new file name:");
            String s2 = b2.readLine();

            String old = s1;
            String newf = s2;
			byte[] oldData = old.getBytes();
            DatagramPacket sourcePacket = new DatagramPacket(oldData, oldData.length, s, port);
            cs.send(sourcePacket);

            byte[] newData = newf.getBytes();
            DatagramPacket targetPacket = new DatagramPacket(newData, newData.length, s, port);
            cs.send(targetPacket);

            cs.close();
        } catch (Exception e) {
            System.out.println(e);
  }
 }
}