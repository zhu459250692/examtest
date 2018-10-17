package thinkinjava.duotai;

//多态发生三要素：继承、重写父类方法、父类的引用指向子类。
//多态发生地点：可以在new一个子类对象时，可以在方法传参时。
//注意：属性没有多态，指针是哪个类，属性就是谁的。
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

    // 只有返回值名字参数都相同才是重写
    public void eat(String aa) {
        System.out.println("student eat");
        super.eat();
    }

    public void walk() {
        super.eat();
    }

}
