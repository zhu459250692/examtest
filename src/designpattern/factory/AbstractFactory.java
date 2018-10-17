package designpattern.factory;

import org.junit.Test;

/*
�м��ֹ����ͳ����ֹ�����
�����һ�ֹ���������ͬ������Ϊ��ͬ��ȥʵ��������󹤳���
һ���������������������
���Ҫ�Թ����Ĺ������з��࣬���ó��󹤳���
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
//ֻ������˹�����û�г�������������������Ļ�Ҫ�޸Ĺ�������
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