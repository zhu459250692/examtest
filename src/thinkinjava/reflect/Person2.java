package thinkinjava.reflect;

@MyAnnotation(value = "zhuvalue")
public class Person2 extends Creature<String> implements Comparable,MyInterface{
    public String name;
    private int age;

    public Person2(){

    }

    public Person2(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @MyAnnotation(value = "lalala")
    public void show(){
        System.out.println("����һ����");
    }

    private void display(String nation) throws Exception{
        System.out.println("�ҵĹ����ǣ�" + nation);
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    class Bird{

    }
}
