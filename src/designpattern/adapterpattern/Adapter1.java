package designpattern.adapterpattern;

//类适配器。对我们想要的方法封装一下，Target就能像之前一样，调用request方法即可。
public class Adapter1 extends Adaptee implements Target{
    @Override
    public void request(){
        this.specialRequest();
    }
}
