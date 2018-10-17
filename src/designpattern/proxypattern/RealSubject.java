package designpattern.proxypattern;

/*
真实类：代理类调用的类。事先不知道这个，用动态代理
 */
public class RealSubject implements Subject {
    @Override
    public void buyMAC() {
        System.out.println("buy MAC");
    }
}
