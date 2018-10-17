package designpattern.adapterpattern;

public class Client {
    public static void main(String[] args) {
        //元素：1：Target期待调用的接口。2：Adaptee手头上有的被适配类。3：Adapter适配器
        //调用这个接口的方法，实际调用到你想实现的功能。
        //优点：这样就在不改动Adaptee类的情况下，进行封装，用这个适配器来达到调用新方法的目的。
        //缺点：过多的适配器会冗余，因此应该先考虑重构统一的接口。
        //场景：不同的开发人员、不同厂家会导致功能类似，但接口不同。还有使用第三方开发组件时。
        Target t1 = new Adapter1();
        t1.request();

        Target t2 = new Adapter2();
        t2.request();
    }
}
