import java.net.*;
import java.io.*;
import java.util.*;
class TcpServer{
	public static void main(String[] args) throws Exception
	{
		int i=0;
		ServerSocket ss=new ServerSocket(5656);
		Socket s=ss.accept();
		Scanner scan=new Scanner(System.in);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		DataInputStream dis=new DataInputStream(s.getInputStream());
		while(true)
		{
			String str=dis.readUTF();
			System.out.println("Client--->"+str);
			if(str.equals("bye"))
			{
				System.out.println("Client Messaged .... BYE..Exiting");
				dis.close();
				s.close();
				ss.close();
				break;
			}
			System.out.println("Enter your message:");
			String str1=scan.nextLine();
			dout.writeUTF(str1);
			dout.flush();
		}
		
	}
}