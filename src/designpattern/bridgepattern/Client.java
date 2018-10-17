package designpattern.bridgepattern;

/*
三个类别的桥接。降低耦合度
 */
public class Client {
    public static void main(String[] args) {
        //new一个大的笔
        Brush brush = new BigBrush();
        brush.setColor(new Red());
        brush.setPerson(new Man());
        brush.paint();
        brush.setColor(new Green());
        brush.setPerson(new Woman());
        brush.paint();
        //new一个小的笔
        Brush brush1 = new SmallBrush();
        brush1.setColor(new Blue());
        brush1.setPerson(new Woman());
        brush1.paint();
    }
}
