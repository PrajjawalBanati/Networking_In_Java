import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(6666);
    while (true) {
      Socket s = ss.accept();
      System.out.println("A new client is connected via " + s);
      DataInputStream dis = new DataInputStream(s.getInputStream());
      DataOutputStream dout = new DataOutputStream(s.getOutputStream());
      dout.writeUTF("Enter the name of the client");
      String name = dis.readUTF();
      System.out.println("Assigning a new thread to the client");
      Thread t1 = new ClientHandler(s, name, dis, dout);
      t1.start();
    }
  }
}