package designpattern.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
http://www.cnblogs.com/xiaoluo501395377/p/3383130.html
 */
interface Subject{
    void action();
    void action2();
}

//�������࣬���������ʵ����
class RealSubject implements Subject{
    @Override
    public void action() {
        System.out.println("buy MAC");
    }

    @Override
    public void action2() {
        System.out.println("bue MAC2");
    }
}

//��̬�����࣬InvocationHandler����
class MyInvocationHandler implements InvocationHandler{
    Object obj;

    //���뱻�����ࡣ
    public MyInvocationHandler(Object object) {
        this.obj = object;
    }
    //�����������ô�����ʱ����������Զ�������
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("���������������");
        //����method��ʲô
        System.out.println("Method:" + method);
        //��������������ʵ����ķ���ʱ������Զ�����ת��������������handler�����invoke���������е���
        Object returnVal = method.invoke(obj, args);
        System.out.println("��װMAC");
        return returnVal;
    }
}

public class DynamicProxy {
    public static void main(String[] args) {
        //    ����Ҫ�������ʵ����
        RealSubject real = new RealSubject();
        //    ����Ҫ�����ĸ���ʵ���󣬾ͽ��ö��󴫽�ȥ�������ͨ������ʵ�����������䷽����
        MyInvocationHandler handler = new MyInvocationHandler(real);
        //���ض�̬������󡣵�һ������real��handler������
        // ���ö�̬�������̳нӿڣ��ڶ����������ڶ�̬���������÷�����ʱ�򣬻������InvocationHandler�Ķ�����
        Object obj =  Proxy.newProxyInstance(real.getClass().getClassLoader(),
                                                real.getClass().getInterfaces(),
                                                    handler);

        System.out.println(obj.getClass().getName());   //���������˵������������ʱ��̬���ɵĶ���
        Subject sub = (Subject)obj;                     //��Ϊ���뿴��ߣ�objֱ�ӵ���action()��ʧ�ܡ�
        sub.action();
        sub.action2();
    }

}
