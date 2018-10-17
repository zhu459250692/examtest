package thinkinjava.socket;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
UDP编程实现
 */
public class UnitTestUDP {

    @Test
    public void send() {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket();
            byte[] b = "你好，我是要发送的数据".getBytes();
            //创建一个数据报：每一个数据报不能大于64k，都记录着数据信息，发送端的IP、端口号，
            //以及要发送至接收端的IP、端口号
            DatagramPacket packet = new DatagramPacket(b, 0, b.length,
                    InetAddress.getByName("127.0.0.1"), 9090);
            ds.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(ds!=null){
                ds.close();
            }
        }
    }

    @Test
    public void receive(){
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9090);
            byte[] b = new byte[1024];
            //用b去接收
            DatagramPacket packet = new DatagramPacket(b, 0 ,b.length);
            //接收到ds里面了
            ds.receive(packet);
            String str = new String(packet.getData(), 0, packet.getLength());
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ds.close();
        }
    }
}
