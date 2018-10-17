package designpattern.factory;

import org.junit.Test;

/*
把工作（产品）抽象出来。
只有一个工厂。
 */
public class SimpleFactory {
    @Test
    public void test() throws Exception{
        getWork("student").doWork();
    }

    public Work getWork(String workName) throws Exception {
        switch (workName){
            case "student":return new StudentWork();
            case "teacher":return new TeacherWork();
            default:throw new Exception("no");
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
}
