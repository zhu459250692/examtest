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
        //创建打印输出流，设置为自动刷新模式（写入换行符或字节'\n'时会刷新输出缓冲区）
        PrintStream ps = new PrintStream(fos, true);
        if(ps!=null)
            System.setOut(ps);
        System.out.println("woshizhuzhu");
        ps.close();
    }
}
