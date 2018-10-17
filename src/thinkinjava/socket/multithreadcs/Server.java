package thinkinjava.socket.multithreadcs;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        InputStream is = null;
        try {
            ss = new ServerSocket(9090);
            while(true){
                s = ss.accept();
                serverThread serverThread = new serverThread(s);
                serverThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class serverThread extends Thread{

    public Socket s = null;

    public serverThread(){

    }

    public serverThread(Socket s){
        this.s = s;
    }

    public void run(){
        InputStream is = null;
        try {
            is = s.getInputStream();

            byte[] b = new byte[10];
            while (is.read(b) != -1) {
                System.out.println(new String(b));
            }
            is.reset();
            for(int i = 0; i < b.length; i++)
                b[i] = 0;
            b = null;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
