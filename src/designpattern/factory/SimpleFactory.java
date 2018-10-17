package designpattern.factory;

import org.junit.Test;

/*
�ѹ�������Ʒ�����������
ֻ��һ��������
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
}
