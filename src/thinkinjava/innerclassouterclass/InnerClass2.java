package thinkinjava.innerclassouterclass;

/*
作用：内部类能继承外部类继承了的或者没继承的，也就是说内部类可以以不同方式实现同一个接口。
      当内部类是private的时候，外部类的可以做到“部分保密”，隐藏实现细节。
特点：外部类的私有属性方法，内部类都能用；内部类的私有属性方法，外部类也能用。
使用：外部类对象.new，并用外部类.内部类接收，可以创建内部类对象。
     在内部类中.this可以返回外部类对象
位置：类内、方法内、代码块内
 */
public class InnerClass2 {
    private int secret = 1;

    private class InnerClassInInnerClass {
        private int secret2 = 2;

        public void print() {
            System.out.println(secret);
            System.out.println("inner print");
            buildClass().print();
        }

        public InnerClass2 buildClass(){
            return InnerClass2.this;
        }
    }

    private void print(){
        System.out.println("outer print");
    }

    public static void main(String[] args) {
        InnerClass2 innerClass2 = new InnerClass2();
        InnerClass2.InnerClassInInnerClass innerClassInInnerClass = innerClass2.new InnerClassInInnerClass();
        System.out.println(innerClassInInnerClass.secret2);
        innerClassInInnerClass.print();
    }
}
