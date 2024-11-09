import java.net.*;
import java.io.*;
 
public class ServerSideData
{
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(200);
 
        byte[] receiveData = new byte[512];
        byte[] sendData = new byte[512];
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println(" UDP Server Socket is created, waiting for client ");
		
	
        while(true)
        {
            DatagramPacket receiveDP = new DatagramPacket(receiveData,receiveData.length);
            ds.receive(receiveDP);
 
            String clientMessage = new String(receiveDP.getData(),0,receiveDP.getLength());
            System.out.println("Client Message:"+clientMessage);
			if(clientMessage.equals("stop"))
				break;
            InetAddress ip = receiveDP.getAddress();
 
            System.out.print("\n\nEnter Server Message:");
            String serverMessage = br.readLine();
            sendData = serverMessage.getBytes();
            DatagramPacket sendDP = new DatagramPacket(sendData, sendData.length, ip, receiveDP.getPort()); 
			
            ds.send(sendDP);
            
        }
 
    }
}