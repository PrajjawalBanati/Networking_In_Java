import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer {

  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(5656);
    Socket s = ss.accept();
    Scanner scan = new Scanner(System.in);
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    DataInputStream dis = new DataInputStream(s.getInputStream());
    while (true) {
      String str = dis.readUTF();
      System.out.println("Client--->" + str);
      if (str.equals("bye")) {
        System.out.println("Client Messaged .... BYE..Exiting");
        dis.close();
        s.close();
        ss.close();
        break;
      }
    }

  }
}