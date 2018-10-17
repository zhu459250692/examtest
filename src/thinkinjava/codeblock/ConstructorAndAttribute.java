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
        //ConstructorAndAttribute调用父类构造器p，p调用父类构造器l，l调用父类构造器m。
        //然后调用该类成员的初始化方法，再调用该类的构造器。
        new ConstructorAndAttribute();
    }
}
