package thinkinjava.codeblock;

public class CodeBlock {
    CodeBlock() {

    }

    public static void main(String[] args) {
        new Leaf();
    }
}

class Root {
    static {
        System.out.println("1");
    }

    {
        System.out.println("4");
    }

    public Root() {
        System.out.println("5");
    }
}

class Mid extends Root {
    static {
        System.out.println("2");
    }

    {
        System.out.println("6");
    }

    public Mid() {
        System.out.println("7");
    }

    public Mid(String msg) {
        this();
        System.out.println("8");
    }
}

class Leaf extends Mid {
    static {
        System.out.println("3");
    }

    {
        System.out.println("9");
    }

    public Leaf() {
        super("?§Û??");
        System.out.println("10");
    }
}
