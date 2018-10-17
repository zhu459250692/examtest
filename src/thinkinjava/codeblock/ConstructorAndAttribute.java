package thinkinjava.codeblock;

import com.sun.deploy.security.SandboxSecurity;

import javax.sound.sampled.Port;

class Meal{
    Meal(){
        draw();
        System.out.println("Meal()");
    }
    void draw(){
        System.out.println("Meal.draw");
    }
}

class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}

class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}

class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
    void draw(){
        System.out.println("Lunch.draw");
    }
}

class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
    void draw(){
        System.out.println("PortableLunch.draw");
    }
}

class Pickle{

}

public class ConstructorAndAttribute extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private ConstructorAndAttribute(){
        System.out.println("ConstructorAndAttribute()");
    }

    public static void main(String[] args) {
        //ConstructorAndAttribute���ø��๹����p��p���ø��๹����l��l���ø��๹����m��
        //Ȼ����ø����Ա�ĳ�ʼ���������ٵ��ø���Ĺ�������
        new ConstructorAndAttribute();
    }
}
