import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(6666);
    Socket s = ss.accept();
    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    Scanner scan = new Scanner(System.in);
    while (true) {
      String str = dis.readUTF();
      System.out.println("Client--->" + str);
      if (str.equals("bye")) {
        System.out.println("Client Said Bye exiting");
        dis.close();
        dout.close();
        s.close();
        ss.close();
        break;
      }
      System.out.println("Enter Your Message");
      String str1 = scan.nextLine();
      dout.writeUTF(str1);
      dout.flush();
    }
  }
}