import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketClass {

  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(9000);
    Socket s = ss.accept();
    DataInputStream dis = new DataInputStream(s.getInputStream());
    String str = dis.readUTF();
    System.out.println("Message:-> " + str);
    ss.close();
  }

}