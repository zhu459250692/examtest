package thinkinjava.innerclassouterclass;

/*
�̳��ڲ���Ĺ�����������ôд
 */
class WithInner{
    class Inner{}
}

public class InnerClassExtends extends WithInner.Inner{
//��    InnerClassExtends(){
//��    }��Ҫ����WithInner.Inner�ķ��ʵ��
    InnerClassExtends(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InnerClassExtends ice = new InnerClassExtends(wi);
    }
}
