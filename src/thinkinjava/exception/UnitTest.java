package thinkinjava.exception;

import org.junit.Test;

public class UnitTest {
    @Test
    public void test(){
        try {
            int[] a = null;
            System.out.println(a[0]);
            throw new RuntimeException();
            //�޷��������ֶ���throw����Exception
        } catch (NullPointerException e) {
            e.printStackTrace();
        }catch(RuntimeException e) {
            e.printStackTrace();
            System.out.println("RuntimeExceptionҲ��catchס");
        }finally {
            System.out.println("��ָ��Ҳ��catchס");
        }

        try{
            throw new sdfException();
        }catch (sdfException e){
            e.printStackTrace();
        }finally {
            System.out.println("���ӵ��쳣Ҳ��catchס");
        }

        System.out.println("����1+1=2��" + (1 + 1));
    }
}

class sdfException extends Exception{
    sdfException(){
        System.out.println("���ӵ��쳣");
    }
}
