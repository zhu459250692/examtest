package designpattern.factory;

/*
把工厂和工作都抽象出来，各一种接口，一个工厂对应一个产品，成对。
工厂方法模式定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method是一个类的实例化延迟到其子类。
 */
public class FactoryMethod {
    public static void main(String[] args) {
        IWorkFactory i = new StudentWorkFactory();
        i.getWork().doWork();
    }
}
interface IWorkFactory{
    Work getWork();
}
class StudentWorkFactory implements IWorkFactory {
    @Override
    public Work getWork(){
        return new StudentWork();
    }
}
class TeacherWorkFactory implements IWorkFactory{
    @Override
    public Work getWork(){
        return new TeacherWork();
    }
}
interface Work{
    void doWork();
}
class StudentWork implements Work{
    @Override
    public void doWork() {
        //也可以写在构造器里面
        System.out.println("学生写作业");
    }
}
class TeacherWork implements Work{
    @Override
    public void doWork() {
        System.out.println("老师改作业");
    }
}
