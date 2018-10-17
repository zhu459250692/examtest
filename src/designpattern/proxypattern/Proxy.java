package designpattern.proxypattern;

/*
代理类：包含对象的引用，从而调用真实对象。两者方法名相同，从而任何时刻可以代替真实对象。
 */
public class Proxy implements Subject{
    @Override
    public void buyMAC() {
        //引用并创建真实对象实例，即”我“
        RealSubject realSubject = new RealSubject();

        //调用真实对象的方法，进行代理购买Mac
        realSubject.buyMAC();
        //代理对象额外做的操作
        this.WrapMac();
    }

    public void WrapMac(){
        System.out.println("用盒子包装好Mac");
    }


}
