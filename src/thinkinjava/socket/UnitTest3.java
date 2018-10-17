package thinkinjava.socket;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
/*
�ͻ��˷����ļ�������ˣ�����˱��浽���أ������ء����ͳɹ������ͻ��ˣ��ر���Ӧ����
 */
public class UnitTest3 {
    @Test
    public void client() throws Exception{
        //1����socket����
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9898);
        //2�ӱ��ػ�ȡһ���ļ����͸�������
        OutputStream os = socket.getOutputStream();
        FileInputStream fis = new FileInputStream(new File("1.jpg"));
        byte[] b = new byte[1024];
        int len;
        while((len = fis.read(b)) != -1){
            os.write(b,0,len);
        }
        socket.shutdownOutput();
        //3�������Է���˵���Ϣ
        InputStream is = socket.getInputStream();
        byte[] b1  = new byte[1024];
        int len1;
        while((len1 = is.read(b1)) != -1){
            String str = new String(b1,0,len1);
            System.out.println(str);
        }
        //4�ر���Ӧ����socket����
        is.close();
        os.close();
        fis.close();
        socket.close();
    }

    @Test
    public void server() throws Exception{
        //1��������
        ServerSocket ss = new ServerSocket(9898);
        //2����accept��������Socket����
        Socket s = ss.accept();
        //3����ͻ��˷�������Ϣ������
        InputStream is = s.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("3.jpg"));
        byte[] b = new byte[1024];
        int len;
        while ((len = is.read(b)) !=  -1){
            fos.write(b,0,len);
        }
        //4���ͽ��ճɹ����ͻ���
        OutputStream os = s.getOutputStream();
        os.write("�㷢�͵�ͼƬ���ѽ��ճɹ�".getBytes());
        //5�ر���Ӧ������socket��serversocket
        os.close();
        fos.close();
        is.close();
        s.close();
        ss.close();
    }
}
