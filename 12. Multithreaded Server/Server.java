import java.net.*;
import java.io.*;
public class Server{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss=new ServerSocket(6666);
		while(true)
		{
			Socket s=ss.accept();
			System.out.println("A new client is connected via "+s);
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Enter the name of the client");
			String name=dis.readUTF();
			System.out.println("Assigning a new thread to the client");
			Thread t1=new ClientHandler(s,name,dis,dout);
			t1.start();
		}
	}
}
class ClientHandler extends Thread{
	Socket s;
	DataInputStream dis;
	DataOutputStream dout;
	String strrecieved="",strsent="",name;
	ClientHandler(Socket s,String name,DataInputStream dis,DataOutputStream dout)
	{
		this.s=s;
		this.dis=dis;
		this.dout=dout;
		this.name=name;
	}
	public void run() 
	{
		try
		{
			while(true)
			{
				dout.writeUTF("What is your name? Written already write Exit.");
				strrecieved=dis.readUTF();
				if(strrecieved.equals("Exit"))
				{
					System.out.println("Client "+this.s+" EXITED");
					this.s.close();
					this.dis.close();
					this.dout.close();
					break;
				}
				System.out.println("Client Messaged "+strrecieved);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}