import java.io.*;
import java.net.*;
public class Sender{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket ds=new DatagramSocket();
		String str="Welcome to my channel";
		InetAddress ip=InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
		ds.send(dp);
		ds.close();
	}
}