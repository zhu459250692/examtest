package thinkinjava.socket;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
/*
客户端发送文件给服务端，服务端保存到本地，并返回“发送成功”给客户端，关闭相应连接
 */
public class UnitTest3 {
    @Test
    public void client() throws Exception{
        //1创建socket对象
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9898);
        //2从本地获取一个文件发送给服务器
        OutputStream os = socket.getOutputStream();
        FileInputStream fis = new FileInputStream(new File("1.jpg"));
        byte[] b = new byte[1024];
        int len;
        while((len = fis.read(b)) != -1){
            os.write(b,0,len);
        }
        socket.shutdownOutput();
        //3接收来自服务端的信息
        InputStream is = socket.getInputStream();
        byte[] b1  = new byte[1024];
        int len1;
        while((len1 = is.read(b1)) != -1){
            String str = new String(b1,0,len1);
            System.out.println(str);
        }
        //4关闭相应流和socket对象
        is.close();
        os.close();
        fis.close();
        socket.close();
    }

    @Test
    public void server() throws Exception{
        //1创建对象
        ServerSocket ss = new ServerSocket(9898);
        //2调用accept方法返回Socket对象
        Socket s = ss.accept();
        //3保存客户端发来的信息到本地
        InputStream is = s.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("3.jpg"));
        byte[] b = new byte[1024];
        int len;
        while ((len = is.read(b)) !=  -1){
            fos.write(b,0,len);
        }
        //4发送接收成功给客户端
        OutputStream os = s.getOutputStream();
        os.write("你发送的图片我已接收成功".getBytes());
        //5关闭相应的流和socket、serversocket
        os.close();
        fos.close();
        is.close();
        s.close();
        ss.close();
    }
}
