package tw.kata.jason;


public class Demo {
    public Demo() { }

    public String func() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.func());
    }
}

