package designpattern.bridgepattern;

abstract class Person {
    public String person;
}

class Man extends Person{
    public Man(){
        this.person = "man";
    }
}

class Woman extends Person{
    public Woman(){
        this.person = "woman";
    }
}
