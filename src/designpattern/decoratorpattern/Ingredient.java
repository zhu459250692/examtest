package designpattern.decoratorpattern;

/*
成分。所有类的父类
 */
public interface Ingredient {
    //返回商品描述
    public String getDescription();

    //返回价格
    public double getPrice();
}

class CoffeeBean1 implements Ingredient {
    private String description = "选了第一种咖啡豆";

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
    private String description = "第二种咖啡豆！";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 100;
    }

}
