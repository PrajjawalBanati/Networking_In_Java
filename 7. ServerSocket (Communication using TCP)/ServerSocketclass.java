import java.net.*;
import java.io.*;
class ServerSocketclass{
	public static void main(String[] args)throws Exception 
	{
		ServerSocket ss=new ServerSocket(9000);
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String str=(String) dis.readUTF();
		System.out.println("Message:-> "+str);
		ss.close();
	}

}