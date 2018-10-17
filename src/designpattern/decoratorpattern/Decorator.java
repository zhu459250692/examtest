package designpattern.decoratorpattern;

public class Decorator implements Ingredient {
    private String description = "我只是装饰器，不知道具体的描述";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 0;       //价格由子类来决定
    }
}

class Milk extends Decorator {
    private String description = "加了牛奶！";
    private Ingredient ingredient = null;

    public Milk(Ingredient beverage) {
        this.ingredient = beverage;
    }

    public String getDescription() {
        return ingredient.getDescription() + "\n" + description;
    }

    public double getPrice() {
        return ingredient.getPrice() + 20;  //20表示牛奶的价格
    }
}

class Soy extends Decorator {
    private String description = "加了豆浆！";
    private Ingredient ingredient = null;

    public Soy(Ingredient beverage) {
        this.ingredient = beverage;
    }

    public String getDescription() {
        return ingredient.getDescription() + "\n" + description;
    }

    public double getPrice() {
        return ingredient.getPrice() + 30;  //30表示豆浆的价格
    }
}