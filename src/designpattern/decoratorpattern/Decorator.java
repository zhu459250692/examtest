package designpattern.decoratorpattern;

public class Decorator implements Ingredient {
    private String description = "��ֻ��װ��������֪�����������";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 0;       //�۸�������������
    }
}

class Milk extends Decorator {
    private String description = "����ţ�̣�";
    private Ingredient ingredient = null;

    public Milk(Ingredient beverage) {
        this.ingredient = beverage;
    }

    public String getDescription() {
        return ingredient.getDescription() + "\n" + description;
    }

    public double getPrice() {
        return ingredient.getPrice() + 20;  //20��ʾţ�̵ļ۸�
    }
}

class Soy extends Decorator {
    private String description = "���˶�����";
    private Ingredient ingredient = null;

    public Soy(Ingredient beverage) {
        this.ingredient = beverage;
    }

    public String getDescription() {
        return ingredient.getDescription() + "\n" + description;
    }

    public double getPrice() {
        return ingredient.getPrice() + 30;  //30��ʾ�����ļ۸�
    }
}