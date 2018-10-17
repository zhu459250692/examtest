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

//这个外部类不能有权限修饰符，只能用默认。
//外部类访问public类，跟其他的
class test {
    private void test() {
        InnerClass innerClass1 = new InnerClass();
//!        InnerClass.InnerClassInInnerClass innerinnerClass1 = innerClass1.buildInnerClass();
//!        System.out.println(innerinnerClass1.secret2);
    }
}
