package thinkinjava.duotai;

//��̬������Ҫ�أ��̳С���д���෽�������������ָ�����ࡣ
//��̬�����ص㣺������newһ���������ʱ�������ڷ�������ʱ��
//ע�⣺����û�ж�̬��ָ�����ĸ��࣬���Ծ���˭�ġ�
public class Student extends Person {
    public int field = 2;

    Student() {
        super();
    }

    public static void main(String[] args) {
        Person s = new Student();
        System.out.println("field:" + s.field);
        Human[] human = {
                new Person(),
                new Student()
        };
        dinner(human);
    }

    public static void dinner(Human[] human) {
        for (Human h : human) {
            h.eat();
            System.out.println("h.field = " + h.field);
        }

    }

    public void eat() {
        System.out.println("student eat");
    }

    // ֻ�з���ֵ���ֲ�������ͬ������д
    public void eat(String aa) {
        System.out.println("student eat");
        super.eat();
    }

    public void walk() {
        super.eat();
    }

}
