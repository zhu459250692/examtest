package designpattern.adapterpattern;

//����������
//�����ʹﵽ��װ��Ŀ�ġ�
public class Adapter2 implements Target{
    Adaptee adaptee = new Adaptee();

    @Override
    public void request(){
        adaptee.specialRequest();
    }
}
