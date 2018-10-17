package thinkinjava.socket;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
�ͻ��˸�����˷�����Ϣ����������������̨��
������ʵ������Socket���
 */
public class UnitTest {

    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;

        try {
            //1����socket����ͨ��������ָ������˵�ip��ַ���Լ�����ճ���Ķ˿ں�
            socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
            //2�������ݣ��ӱ��ػ�ȡһ���ļ����͸�������������һ��OutputStream����
            os = socket.getOutputStream();
            //3������������
            os.write("���ǿͻ���".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            //4�ر�����socket����
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
            //1����ServerSocket����ָ���˿ں�
            ss = new ServerSocket(9090);
            //2������accept����������һ��Socket����
            s = ss.accept();
            //3����Socket�����getInputStream()������ȡһ���ӿͻ��˷��͹�����������
            is = s.getInputStream();
            //4�Ի�ȡ�����������еĲ���
            byte[] b = new byte[20];
            int len;
            while ((len = is.read(b)) != -1){
                String str = new String(b,0,len);
                System.out.println(str);
            }
            System.out.println("�յ�������" +s.getInetAddress().getHostName() +"������");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5�ر���Ӧ�����Լ�Socket��ServerSocket����
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
