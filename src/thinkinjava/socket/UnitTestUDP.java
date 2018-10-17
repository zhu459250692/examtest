package thinkinjava.socket;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
UDP���ʵ��
 */
public class UnitTestUDP {

    @Test
    public void send() {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket();
            byte[] b = "��ã�����Ҫ���͵�����".getBytes();
            //����һ�����ݱ���ÿһ�����ݱ����ܴ���64k������¼��������Ϣ�����Ͷ˵�IP���˿ںţ�
            //�Լ�Ҫ���������ն˵�IP���˿ں�
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
            //��bȥ����
            DatagramPacket packet = new DatagramPacket(b, 0 ,b.length);
            //���յ�ds������
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
