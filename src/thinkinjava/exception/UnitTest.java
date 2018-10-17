package thinkinjava.exception;

import org.junit.Test;

public class UnitTest {
    @Test
    public void test(){
        try {
            int[] a = null;
            System.out.println(a[0]);
            throw new RuntimeException();
            //无法连续地手动地throw两个Exception
        } catch (NullPointerException e) {
            e.printStackTrace();
        }catch(RuntimeException e) {
            e.printStackTrace();
            System.out.println("RuntimeException也能catch住");
        }finally {
            System.out.println("空指针也能catch住");
        }

        try{
            throw new sdfException();
        }catch (sdfException e){
            e.printStackTrace();
        }finally {
            System.out.println("我扔的异常也能catch住");
        }

        System.out.println("测试1+1=2：" + (1 + 1));
    }
}

class sdfException extends Exception{
    sdfException(){
        System.out.println("我扔的异常");
    }
}
