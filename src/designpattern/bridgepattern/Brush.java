package designpattern.bridgepattern;

//把笔抽象出来
abstract class Brush {
    protected Color c;
    protected Person p;
    //不同的笔和颜色有不同的实现方式，因此各自重写抽象方法。
    public abstract void paint();
    //颜色不需要抽象出来，它通过多态实现即可。
    public void setColor(Color c) {
        this.c = c;
    }
    public void setPerson(Person p){
        this.p = p;
    }
}

class BigBrush extends Brush {
    @Override
    public void paint() {
        System.out.println(p.person + " use big brush paint " + c.color);
    }
}

class SmallBrush extends Brush {
    @Override
    public void paint() {
        System.out.println(p.person + " use small brush paint " + c.color);
    }
}
