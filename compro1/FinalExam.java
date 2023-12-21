package compro1;

public class FinalExam {
    public static void main(String args[]) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption = true;
        stv.displayCaption("Hello, World");

        Parent p = new Child();
        Child c = new Child();

        // 멤버변수의 접근은 참조변수의 타입에 따라 결정된다
        System.out.println("p.x = " + p.x);
        System.out.println("c.x = " + c.x);

        // 메서드는 참조변수가 실제로 참조하고 있는 인스턴스의 타입에 따라 결정된다
        p.method();
        c.method();
    }
}
class Tv123 {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}
class SmartTv extends Tv123 {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class Parent{
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    int x = 200;
    void method() {
        System.out.println("Child Method");
    }
}