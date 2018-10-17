package designpattern.single;

public class Single {//也可以写final
    private static Single instance = null;//这个和下面的方法必须是静态的，这样才能类名.方法来调用方法。用的时候才new对象。
    static Object object = new Object();    //否则无法调用方法。

    private Single() {
        // 这样就不能new这个类！
    }

    //双重检验是因为，synchronized是较重的锁，会使并发效率较低。
    public static Single getSingle() {
        if (instance == null) {
            synchronized (object) {
                if (instance == null) {
                    instance = new Single();
                }
            }
        }
        return instance;
    }
}

class Single2 {
    private static Single2 instance = new Single2();

    private Single2() {
        //这样就不能new这个类！
    }

    public static Single2 getSingle() {
        return instance;
    }
}

