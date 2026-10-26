import java.io.*;
import java.net.*;

public class MyClient1
{
    Socket s;
    DataInputStream din;
    DataOutputStream dout;

    public MyClient1()
    {
        try
        {
            
            s=new Socket("localhost",10);
            System.out.println(s);

            din=new DataInputStream(s.getInputStream());
            dout=new DataOutputStream(s.getOutputStream());

            clientChat();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void clientChat() throws IOException
    {
        // remaining code is below the visible part of the image
    }
}