import java.net.*;
import java.io.*;
import java.util.*;
public class TcpClient{
	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		Socket s=new Socket("localhost",5656);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		DataInputStream dis=new DataInputStream(s.getInputStream());
		while(true)
		{
			System.out.println("Write Your message");
			String str=scan.nextLine();
			dout.writeUTF(str);
			dout.flush();
			if(str.equals("bye"))
			{
				dout.close();
				s.close();
				break;
			}
			
		}
	}
}
			