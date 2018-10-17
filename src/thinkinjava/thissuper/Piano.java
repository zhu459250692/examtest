package thinkinjava.thissuper;

public class Piano extends Instrument{
    public int numInstrument = 3;

    public Piano(){

    }

    public Piano(int numInstrument){
        //super表示构造器
        super();
        //当前值和传入参数区别开来。
        this.numInstrument = numInstrument;
    }

    @Override
    public void play() {
        System.out.println("play piano");
    }

    public void piano(){
        //重写了父类方法，还想调父类方法，要super
        super.play();
        //没有重写父类方法，可以直接调用
        instrument();
        System.out.println("buy piano");
        //虽然不加this能打印当前类的值，但加了this更清楚。
        System.out.println("numInstrument = " + this.numInstrument);
    }

}
