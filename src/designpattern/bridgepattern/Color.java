package designpattern.bridgepattern;

//把颜色抽象出来
abstract class Color {
    public String color;
}

class Red extends Color{
    public Red(){
        this.color = "red";
    }
}

class Green extends Color{
    public Green(){
        this.color = "green";
    }
}

class Blue extends Color{
    public Blue(){
        this.color = "blue";
    }
}
