import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * @author Deki on 03.10.2020
 * @project Networking_In_Java
 **/
public class ClientHandler extends Thread {

  Socket s;
  DataInputStream dis;
  DataOutputStream dout;
  String strrecieved = "", strsent = "", name;

  public ClientHandler(Socket s, String name, DataInputStream dis, DataOutputStream dout) {
    this.s = s;
    this.dis = dis;
    this.dout = dout;
    this.name = name;
  }

  @Override
  public void run() {
    try {
      while (true) {
        dout.writeUTF("What is your name? Written already write Exit.");
        strrecieved = dis.readUTF();
        if (strrecieved.equals("Exit")) {
          System.out.println("Client " + this.s + " EXITED");
          this.s.close();
          this.dis.close();
          this.dout.close();
          break;
        }
        System.out.println("Client Messaged " + strrecieved);
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}