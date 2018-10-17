package thinkinjava.inputoutput;

import org.junit.Test;

import java.io.*;

public class UseObjectInputOutputStream{
    //�������л�����
    @Test
    public void testObjectOutputStream() {
        Person p1 = new Person("С��", 18);
        Person p2 = new Person("С��", 28);
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("objectperson.txt"));
            oos.writeObject(p1);
            oos.flush();
            oos.writeObject(p2);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //�������л�����
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("objectperson.txt"));
            Person p1 = (Person)ois.readObject();
            System.out.println(p1);
            Person p2 = (Person)ois.readObject();
            System.out.println(p2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(ois!= null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


//Ҫ����Ҫʵ��Serializable�ӿڣ���������ҲҪʵ��Serializable�ӿ�
class Person implements Serializable{

//    public static final long serialVersionUID = 13543246843213L;
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
