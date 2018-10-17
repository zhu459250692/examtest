package designpattern.bridgepattern;

//�ѱʳ������
abstract class Brush {
    protected Color c;
    protected Person p;
    //��ͬ�ıʺ���ɫ�в�ͬ��ʵ�ַ�ʽ����˸�����д���󷽷���
    public abstract void paint();
    //��ɫ����Ҫ�����������ͨ����̬ʵ�ּ��ɡ�
    public void setColor(Color c) {
        this.c = c;
    }
    public void setPerson(Person p){
        this.p = p;
    }
}

class BigBrush extends Brush {
    @Override
    public void paint() {
        System.out.println(p.person + " use big brush paint " + c.color);
    }
}

class SmallBrush extends Brush {
    @Override
    public void paint() {
        System.out.println(p.person + " use small brush paint " + c.color);
    }
}
