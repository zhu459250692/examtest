package designpattern.decoratorpattern;

import org.junit.Test;

/*
��������Ҫ��չһ����Ĺ��ܡ���̬��Ϊһ���������ӹ��ܣ����һ��ܶ�̬���������̳в���������һ�㣬�̳еĹ����Ǿ�̬�ģ����ܶ�̬��ɾ����
https://blog.csdn.net/zhshulin/article/details/38665187
https://www.cnblogs.com/java-my-life/archive/2012/04/20/2455726.html
 */
public class UnitTest {
    //ingredient�����в��ϡ��ռ���Ϣ����
    @Test
    public void test() {
        Ingredient ingredient = new CoffeeBean1();  //ѡ���˵�һ�ֿ��ȶ�ĥ�ƵĿ���
        ingredient = new Soy(ingredient);     //Ϊ���ȼ���Ħ��
        ingredient = new Milk(ingredient);
        System.out.println(ingredient.getDescription() + "\n����Ħ����ţ�̵Ŀ��ȼ۸�" + ingredient.getPrice());
    }
}
