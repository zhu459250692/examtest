package designpattern.proxypattern;

/*
������ͱ���������һ����ͬ�Ľӿڣ���������ʵ���˽ӿڵĳ��󷽷�������������˱�������ķ��������������Լ��ķ�������main�����д�����������󲢵��ü��ɡ�
ȱ�㣺�����ٶȱ���
���ã����з��ʿ��ơ�Զ��ͨ�š���־������
������Զ�̴���
 */
public class Main {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.buyMAC();

    }
}
