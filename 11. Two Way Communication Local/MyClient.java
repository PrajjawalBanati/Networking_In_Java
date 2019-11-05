import java.net.*;
import java.io.*;
import java.util.*;
public class MyClient{
	public static void main(String[] args)throws Exception{
	Socket s=new Socket("192.168.43.153",6666);
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	DataInputStream din=new DataInputStream(s.getInputStream());
	Scanner scan=new Scanner(System.in);
	while(true)
	{
		System.out.println("Enter Your message.");
		String str=scan.nextLine();
		dout.writeUTF(str);
		dout.flush();
		if(str.equals("bye"))
		{
			dout.close();
			s.close();
			break;
		}
		String str1=(String)din.readUTF();
		System.out.println("Server--->"+str1);
		
	}
	}
}