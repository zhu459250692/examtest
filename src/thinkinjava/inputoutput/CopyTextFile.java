package thinkinjava.inputoutput;

import org.junit.Test;

import java.io.*;

public class CopyTextFile {

    @Test
    public void useByteStream() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            FileInputStream fis = new FileInputStream(new File("test1.txt"));
            FileOutputStream fos = new FileOutputStream(new File("test2.txt"));
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            int len = 0;
            byte[] b = new byte[20];
            while ((len = bis.read(b)) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void useCharacterStream() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            FileReader fr = new FileReader(new File("test1.txt"));
            FileWriter fw = new FileWriter(new File("test2.txt"));
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            char[] c = new char[20];
            int len;
            while ((len = br.read(c)) != -1) {
                bw.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
