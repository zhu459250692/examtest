package designpattern.decoratorpattern;

/*
�ɷ֡�������ĸ���
 */
public interface Ingredient {
    //������Ʒ����
    public String getDescription();

    //���ؼ۸�
    public double getPrice();
}

class CoffeeBean1 implements Ingredient {
    private String description = "ѡ�˵�һ�ֿ��ȶ�";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 50;
    }

}

class CoffeeBean2 implements Ingredient {
    private String description = "�ڶ��ֿ��ȶ���";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 100;
    }

}
