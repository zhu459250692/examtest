package thinkinjava.innerclassouterclass;

/*
���ã��ڲ����ܼ̳��ⲿ��̳��˵Ļ���û�̳еģ�Ҳ����˵�ڲ�������Բ�ͬ��ʽʵ��ͬһ���ӿڡ�
      ���ڲ�����private��ʱ���ⲿ��Ŀ������������ֱ��ܡ�������ʵ��ϸ�ڡ�
�ص㣺�ⲿ���˽�����Է������ڲ��඼���ã��ڲ����˽�����Է������ⲿ��Ҳ���á�
ʹ�ã��ⲿ�����.new�������ⲿ��.�ڲ�����գ����Դ����ڲ������
     ���ڲ�����.this���Է����ⲿ�����
λ�ã����ڡ������ڡ��������
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
