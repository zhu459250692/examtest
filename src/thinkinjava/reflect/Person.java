package thinkinjava.reflect;

public class Person {
    public String name;
    private Integer age;

//    public Person() {
//    }
//
//    public Person(Integer age) {
//        this.age = age;
//    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void show(String nation){
        System.out.println("�����ǣ�" + nation);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
