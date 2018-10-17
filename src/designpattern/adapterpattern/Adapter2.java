package designpattern.adapterpattern;

//对象适配器
//这样就达到封装的目的。
public class Adapter2 implements Target{
    Adaptee adaptee = new Adaptee();

    @Override
    public void request(){
        adaptee.specialRequest();
    }
}
