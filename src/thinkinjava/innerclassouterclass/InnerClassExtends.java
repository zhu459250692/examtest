package thinkinjava.innerclassouterclass;

/*
继承内部类的构造器必须这么写
 */
class WithInner{
    class Inner{}
}

public class InnerClassExtends extends WithInner.Inner{
//！    InnerClassExtends(){
//！    }需要包含WithInner.Inner的封闭实例
    InnerClassExtends(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InnerClassExtends ice = new InnerClassExtends(wi);
    }
}
