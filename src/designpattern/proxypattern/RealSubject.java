package designpattern.proxypattern;

/*
��ʵ�ࣺ��������õ��ࡣ���Ȳ�֪��������ö�̬����
 */
public class RealSubject implements Subject {
    @Override
    public void buyMAC() {
        System.out.println("buy MAC");
    }
}
