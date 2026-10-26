package ecoserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client1 {

    Socket s;
    DataInputStream din;
    DataOutputStream dout;

    public Client1() {
        try {

            s = new Socket("localhost", 10);
            System.out.println(s);

            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            clientChat();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clientChat() throws IOException {

    }

    public static void main(String[] args) {
        new Client1();
    }
}