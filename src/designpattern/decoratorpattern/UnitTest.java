package designpattern.decoratorpattern;

import org.junit.Test;

/*
场景：需要扩展一个类的功能。动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
https://blog.csdn.net/zhshulin/article/details/38665187
https://www.cnblogs.com/java-my-life/archive/2012/04/20/2455726.html
 */
public class UnitTest {
    //ingredient在其中不断“收集信息”。
    @Test
    public void test() {
        Ingredient ingredient = new CoffeeBean1();  //选择了第一种咖啡豆磨制的咖啡
        ingredient = new Soy(ingredient);     //为咖啡加了摩卡
        ingredient = new Milk(ingredient);
        System.out.println(ingredient.getDescription() + "\n加了摩卡和牛奶的咖啡价格：" + ingredient.getPrice());
    }
}
