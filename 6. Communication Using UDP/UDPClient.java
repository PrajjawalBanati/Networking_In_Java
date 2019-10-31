import java.net.*;
import java.io.*;
import java.util.*;
class UDPClient{
	public static void main(String[] args) throws Exception
	{
		
		DatagramSocket ds=new DatagramSocket();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your message:");
			String str=scan.nextLine();
			InetAddress ip=InetAddress.getByName("localhost");
			DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,2334);
			ds.send(dp);
			if(str.equals("bye"))
			{
				ds.close();
				break;
			}
			
		}
	}
}