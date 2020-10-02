import java.io.DataOutputStream;
import java.net.Socket;

public class SocketClass {

  public static void main(String[] args) throws Exception {
    Socket s = new Socket("localhost", 9000);
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    dout.writeUTF("Hello my name is Prajjawal");
    dout.flush();
    dout.close();
    s.close();
  }
}