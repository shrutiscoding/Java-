
import java.io.*;
import java.net.*;
 
public class ClientSideData
{
    public static void main(String[] args) throws IOException 
	{
        DatagramSocket ds = new DatagramSocket();
 
        byte[] receiveData = new byte[512];
        byte[] sendData = new byte[512];
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println(" UDP Client Socket is created, waiting for server ");
 
        InetAddress ip = InetAddress.getLocalHost();
 
        do
        {
            System.out.print("\nEnter Client Message:");
            String clientMessage = br.readLine();
            sendData = clientMessage.getBytes();
       
            DatagramPacket sendDP = new DatagramPacket(sendData, sendData.length, ip, 200);
            ds.send(sendDP);
 
            DatagramPacket receiveDP = new DatagramPacket(receiveData,receiveData.length);
            ds.receive(receiveDP);
            String serverMessage = new String(receiveDP.getData(),0,receiveDP.getLength());
			if(serverMessage.equals("stop"))
				break;
            System.out.println("\n\nServer Message:"+serverMessage);
        }while(true);
 
         
    }
}