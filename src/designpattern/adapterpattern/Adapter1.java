package designpattern.adapterpattern;

//������������������Ҫ�ķ�����װһ�£�Target������֮ǰһ��������request�������ɡ�
public class Adapter1 extends Adaptee implements Target{
    @Override
    public void request(){
        this.specialRequest();
    }
}
