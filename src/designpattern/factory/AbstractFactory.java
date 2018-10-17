package designpattern.factory;

import org.junit.Test;

/*
有几种工作就抽象几种工作。
抽象出一种工厂，但不同工厂作为不同类去实现这个抽象工厂。
一个工厂可以做多个工作。
如果要对工厂的工作进行分类，就用抽象工厂。
 */
public class AbstractFactory {
    @Test
    public void test(){
        FactoryA factoryA = new FactoryA();
        factoryA.getWorkStudent();

        FactoryB factoryB = new FactoryB();
        factoryB.getWorkTeacher();
    }
}

interface Student {}

interface Teacher {}

class Sam implements Student {
    public Sam(){
        System.out.println("sam work");
    }
}

class Bob implements Student {
    public Bob(){
        System.out.println("Bob work");
    }
}

class DrLi implements Teacher {
    public DrLi() {
        System.out.println("DrLi work");
    }
}

class DrWu implements Teacher{
    public DrWu(){
        System.out.println("DrWu work");
    }
}

interface IfWorkFactory{
    public Student getWorkStudent();
    public Teacher getWorkTeacher();
}
//只抽象出了工厂，没有抽象出工作，新增工作的话要修改工厂方法
class FactoryA implements IfWorkFactory{
    @Override
    public Student getWorkStudent() {
        return new Sam();
    }

    @Override
    public Teacher getWorkTeacher() {
        return new DrLi();
    }
}

class FactoryB implements IfWorkFactory{
    @Override
    public Student getWorkStudent() {
        return new Bob();
    }

    @Override
    public Teacher getWorkTeacher() {
        return new DrWu();
    }
}