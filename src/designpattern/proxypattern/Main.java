package designpattern.proxypattern;

/*
代理类和被代理类有一个共同的接口，被代理类实现了接口的抽象方法，代理类调用了被代理类的方法，并加入了自己的方法。在main函数中创建代理类对象并调用即可。
缺点：请求速度变慢
作用：进行访问控制、远程通信、日志、缓存
场景：远程代理
 */
public class Main {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.buyMAC();

    }
}
