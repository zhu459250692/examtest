package thinkinjava.thissuper;

import org.junit.Test;
/*
super可以表示：属性、方法、构造器。重写了父类方法，还想调父类方法，要super
this可以表示：属性、方法、构造器。重写了父类方法，还想调自身方法，要this。
子类对父类是详细说明的作用
 */
public class UnitTest {
    @Test
    public void test(){
        Piano piano = new Piano();
        piano.play();
        piano.piano();
    }
}
