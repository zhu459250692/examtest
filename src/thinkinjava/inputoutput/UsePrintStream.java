package thinkinjava.inputoutput;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class UsePrintStream {
    @Test
    public void testPrintStream(){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("testprint.txt"));
        }catch (IOException e){
            e.printStackTrace();
        }
        //������ӡ�����������Ϊ�Զ�ˢ��ģʽ��д�뻻�з����ֽ�'\n'ʱ��ˢ�������������
        PrintStream ps = new PrintStream(fos, true);
        if(ps!=null)
            System.setOut(ps);
        System.out.println("woshizhuzhu");
        ps.close();
    }
}
