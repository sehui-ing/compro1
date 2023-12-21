package compro1;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
        for (int i = 0; i < 10; i++) {
            foo();
        }
    }

    static void change(int x) { // 기본형 매개변수
        x = 1000;
        System.out.println("change() : x = " + x);
    }

    static void foo() {
        int count = 777;
        System.out.println(count);
    }
}
