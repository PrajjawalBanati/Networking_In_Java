import java.io.*;
import java.net.*;
class InetAddressclass{
	public static void main(String[] args)
	{
		try
		{
			InetAddress ip=InetAddress.getByName("www.golang.org");
			System.out.println("HostName: "+ip.getHostName());
			System.out.println("IP address: "+ip.getHostAddress());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}