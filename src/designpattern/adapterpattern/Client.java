package designpattern.adapterpattern;

public class Client {
    public static void main(String[] args) {
        //Ԫ�أ�1��Target�ڴ����õĽӿڡ�2��Adaptee��ͷ���еı������ࡣ3��Adapter������
        //��������ӿڵķ�����ʵ�ʵ��õ�����ʵ�ֵĹ��ܡ�
        //�ŵ㣺�������ڲ��Ķ�Adaptee�������£����з�װ����������������ﵽ�����·�����Ŀ�ġ�
        //ȱ�㣺����������������࣬���Ӧ���ȿ����ع�ͳһ�Ľӿڡ�
        //��������ͬ�Ŀ�����Ա����ͬ���һᵼ�¹������ƣ����ӿڲ�ͬ������ʹ�õ������������ʱ��
        Target t1 = new Adapter1();
        t1.request();

        Target t2 = new Adapter2();
        t2.request();
    }
}
