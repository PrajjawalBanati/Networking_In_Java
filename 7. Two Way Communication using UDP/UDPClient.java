import java.net.*;
import java.io.*;
import java.util.*;
class UDPClient{
	public static void main(String[] args) throws Exception
	{
		
		DatagramSocket ds=new DatagramSocket();
		DatagramSocket ds1=new DatagramSocket(6000);
		byte[] buff=new byte[1024];
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
			DatagramPacket dpreceive=new DatagramPacket(buff,buff.length);
			ds1.receive(dpreceive);
			String str1=new String(dpreceive.getData(),0,dpreceive.getLength());
			System.out.println("Server Messaged--> "+str1);
			buff=new byte[1024];
		}
	}
}