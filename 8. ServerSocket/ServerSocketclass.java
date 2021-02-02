import java.net.*;
import java.io.*;
class ServerSocketclass{
	public static void main(String[] args)throws Exception 
	{
		ServerSocket serverSocket=new ServerSocket(9000);
		Socket socket=serverSocket.accept();
		DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
		String string=(String) dataInputStream.readUTF();
		System.out.printf("Message:-> %s",string);
		serverSocket.close();
	}

}
