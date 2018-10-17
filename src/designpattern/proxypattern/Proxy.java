package designpattern.proxypattern;

/*
�����ࣺ������������ã��Ӷ�������ʵ�������߷�������ͬ���Ӷ��κ�ʱ�̿��Դ�����ʵ����
 */
public class Proxy implements Subject{
    @Override
    public void buyMAC() {
        //���ò�������ʵ����ʵ���������ҡ�
        RealSubject realSubject = new RealSubject();

        //������ʵ����ķ��������д�����Mac
        realSubject.buyMAC();
        //�������������Ĳ���
        this.WrapMac();
    }

    public void WrapMac(){
        System.out.println("�ú��Ӱ�װ��Mac");
    }


}
