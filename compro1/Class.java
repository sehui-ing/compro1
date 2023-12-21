package compro1;
import java.util.*;

class Data {
    int x;
}
public class Class {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다");

        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다");

        t2 = t1;
        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경하였습니다");
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다");

        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height + " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 크기는 (" + c2.width + ", " + c2.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다");

        c1.width = 50;
        c2.height = 80;
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c1은 " + c2.kind + ", " + c2.number + "이며 크기는 (" + c2.width + ", " + c2.height + ")");

        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        long result4 = mm.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);

        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);

        Data2 d2 = new Data2();
        d2.x = 10;
        System.out.println("main() : x = " + d2.x);
        change(d2);
        System.out.println("After change(d2)");
        System.out.println("main() : x = " + d2.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
    static void change(Data2 d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }
    long subtract(long a, long b) { return a - b; }
    long multiply(long a, long b) { return a * b; }
    long divide(long a, long b) { return a / b; }
}

class Data2 {
    int x;
}