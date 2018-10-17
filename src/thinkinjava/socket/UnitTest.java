package thinkinjava.socket;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
客户端给服务端发送信息，服务端输出到控制台上
网络编程实际上是Socket编程
 */
public class UnitTest {

    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;

        try {
            //1创建socket对象，通过构造器指明服务端的ip地址，以及其接收程序的端口号
            socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
            //2发送数据，从本地获取一个文件发送给服务器。返回一个OutputStream对象
            os = socket.getOutputStream();
            //3具体的输出过程
            os.write("我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            //4关闭流和socket对象
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void server(){
        ServerSocket ss = null;
        Socket s = null;
        InputStream is = null;
        try {
            //1创建ServerSocket对象，指明端口号
            ss = new ServerSocket(9090);
            //2调用其accept方法，返回一个Socket对象
            s = ss.accept();
            //3调用Socket对象的getInputStream()方法获取一个从客户端发送过来的输入流
            is = s.getInputStream();
            //4对获取的输入流进行的操作
            byte[] b = new byte[20];
            int len;
            while ((len = is.read(b)) != -1){
                String str = new String(b,0,len);
                System.out.println(str);
            }
            System.out.println("收到来自于" +s.getInetAddress().getHostName() +"的连接");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5关闭相应的流以及Socket、ServerSocket对象
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(s != null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
