package thinkinjava.socket.multithreadcs;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client1 implements Runnable {
    int id = 0;

    public Client1(){

    }

    public Client1(int id){
        this.id = id;
    }
    @Override
    public void run() {
        Socket socket = null;
        OutputStream os = null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
            os = socket.getOutputStream();
//            os.write(InetAddress.getLocalHost().getHostName().getBytes());
            String str = "";
            while(!str.equals("exit")){
                Thread.currentThread().setName(String.valueOf(id));
                System.out.println(Thread.currentThread().getName() + "say:");
                Scanner input = new Scanner(System.in);
                str = input.nextLine();
                //write一次，服务器就立马显示
                os.write(("im client" + Thread.currentThread().getName()).getBytes());
                os.flush();
                Thread.currentThread().sleep(10);
                os.write(str.getBytes());
                os.flush();
            }
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
