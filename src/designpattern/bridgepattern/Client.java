package designpattern.bridgepattern;

/*
���������Žӡ�������϶�
 */
public class Client {
    public static void main(String[] args) {
        //newһ����ı�
        Brush brush = new BigBrush();
        brush.setColor(new Red());
        brush.setPerson(new Man());
        brush.paint();
        brush.setColor(new Green());
        brush.setPerson(new Woman());
        brush.paint();
        //newһ��С�ı�
        Brush brush1 = new SmallBrush();
        brush1.setColor(new Blue());
        brush1.setPerson(new Woman());
        brush1.paint();
    }
}
