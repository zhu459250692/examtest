package designpattern.bridgepattern;

//����ɫ�������
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
