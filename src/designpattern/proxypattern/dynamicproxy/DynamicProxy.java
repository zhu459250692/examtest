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

//被代理类，被代理的真实对象
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

//动态代理类，InvocationHandler对象
class MyInvocationHandler implements InvocationHandler{
    Object obj;

    //传入被代理类。
    public MyInvocationHandler(Object object) {
        this.obj = object;
    }
    //代理类对象调用代理方法时，这个方法自动被调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这就是面向切面编程");
        //看看method是什么
        System.out.println("Method:" + method);
        //当代理对象调用真实对象的方法时，其会自动地跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object returnVal = method.invoke(obj, args);
        System.out.println("包装MAC");
        return returnVal;
    }
}

public class DynamicProxy {
    public static void main(String[] args) {
        //    我们要代理的真实对象
        RealSubject real = new RealSubject();
        //    我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
        MyInvocationHandler handler = new MyInvocationHandler(real);
        //返回动态代理对象。第一个参数real和handler都可以
        // ①让动态代理对象继承接口（第二个参数）②动态代理对象调用方法的时候，会关联到InvocationHandler的对象上
        Object obj =  Proxy.newProxyInstance(real.getClass().getClassLoader(),
                                                real.getClass().getInterfaces(),
                                                    handler);

        System.out.println(obj.getClass().getName());   //输出的类名说明，它是运行时动态生成的对象
        Subject sub = (Subject)obj;                     //因为编译看左边，obj直接调用action()会失败。
        sub.action();
        sub.action2();
    }

}
