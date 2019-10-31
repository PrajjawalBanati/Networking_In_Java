import java.net.*;
import java.io.*;
public class UDPServer{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket ds=new DatagramSocket(2334);
		byte[] buff=new byte[1024];
		//DatagramPacket dpreceive=null;
		while(true){
			DatagramPacket dpreceive=new DatagramPacket(buff,buff.length);
			ds.receive(dpreceive);
			String str=new String(dpreceive.getData(),0,dpreceive.getLength());
			System.out.println("Client Messaged--> "+str);
			if(str.equals("bye"))
			{
				System.out.println("Server Is Exiting .... BYE");
				break;
			}
			buff=new byte[1024];
		}
		
	}
}