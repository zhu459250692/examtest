package thinkinjava.thissuper;

public class Piano extends Instrument{
    public int numInstrument = 3;

    public Piano(){

    }

    public Piano(int numInstrument){
        //super��ʾ������
        super();
        //��ǰֵ�ʹ��������������
        this.numInstrument = numInstrument;
    }

    @Override
    public void play() {
        System.out.println("play piano");
    }

    public void piano(){
        //��д�˸��෽������������෽����Ҫsuper
        super.play();
        //û����д���෽��������ֱ�ӵ���
        instrument();
        System.out.println("buy piano");
        //��Ȼ����this�ܴ�ӡ��ǰ���ֵ��������this�������
        System.out.println("numInstrument = " + this.numInstrument);
    }

}
