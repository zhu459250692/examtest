package thinkinjava.innerclassouterclass;

 public class InnerClass {
    private static int secret = 1;

    public static void main(String[] args) {
        InnerClassInInnerClass innerinnerClass = buildInnerClass();
        System.out.println(innerinnerClass.secret2);
        buildInnerClass().print();
    }

    private static class InnerClassInInnerClass {
        private int secret2 = 2;

        private static void print() {
            System.out.println(secret);
            System.out.println("inner print");
            InnerClass.print();
        }
    }

    private static void print(){
        System.out.println("outer print");
    }

    public static InnerClassInInnerClass buildInnerClass() {
        return new InnerClassInInnerClass();

    }
}

//����ⲿ�಻����Ȩ�����η���ֻ����Ĭ�ϡ�
//�ⲿ�����public�࣬��������
class test {
    private void test() {
        InnerClass innerClass1 = new InnerClass();
//!        InnerClass.InnerClassInInnerClass innerinnerClass1 = innerClass1.buildInnerClass();
//!        System.out.println(innerinnerClass1.secret2);
    }
}
