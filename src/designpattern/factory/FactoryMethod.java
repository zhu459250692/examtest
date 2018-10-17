package designpattern.factory;

/*
�ѹ����͹����������������һ�ֽӿڣ�һ��������Ӧһ����Ʒ���ɶԡ�
��������ģʽ����һ�����ڴ�������Ľӿڣ����������ʵ������һ���ࡣFactory Method��һ�����ʵ�����ӳٵ������ࡣ
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
        //Ҳ����д�ڹ���������
        System.out.println("ѧ��д��ҵ");
    }
}
class TeacherWork implements Work{
    @Override
    public void doWork() {
        System.out.println("��ʦ����ҵ");
    }
}
