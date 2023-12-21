package compro1;

import java.util.Scanner;

public class _01_HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        int a = 10;
        int b = 5;
        System.out.println(a+b);

        int Age = 26;
        float Square_height = 33;
        double Square_width = 2.6;
        double PI = 3.14;
        boolean hasBelief = false;

        int c = 1000000000;
        int d = 100000;
        int tmp;
        System.out.println(c);
        System.out.println(d);
        System.out.println("");

        tmp = c;
        c = d;
        d = tmp;
        System.out.println(c);
        System.out.println(d);
        System.out.println();
        System.out.println(tmp);

        final int CONST;
        CONST = 2;
        System.out.println(CONST);

        byte binary1 = 0b01111111; // 0b10000001;
        byte binary2 = 0b01000000;
        System.out.println(binary2);

        int bi = (byte)0b10000000;
        int bina = (byte)0b11110101;
        System.out.println(bi);
        System.out.println(bina);

        short a1 = 0454; // 8진수는 0으로 시작하며 이진수를 3비트씩 묶어서 1자리로 표현
        short b2 = 0776;
        short c3 = 0566;
        System.out.println(a1);
        System.out.println(b2);
        System.out.println(c3);

        short x = 0b100101100; // 4 + 8 + 32 + 256
        short y = 0b111111110; // 2 + 4 + 8 + 16 + 32 + 64 + 128 + 256
        short z = 0b101110110; // 2 + 4 + 16 + 32 + 64 + 256

        short a123 = 0454; // 8진수는 0으로 시작하며 이진수를 3비트씩 묶어서 1자리로 표현
        short b123 = 0776;
        short c123 = 0566;

        System.out.println(""+ x + y + z);
        System.out.println(""+ a123 + " " + b123 + " " + c123);

        //int i = 0b1010; // 0b00000000000000000000000000001010

        //i = ~i;
        //System.out.println(i); // 출력 결과는?

        Loop1 : for(int i=2;i <=9;i++) {
            for(int j=1;j <=9;j++) {
                if(j==5)
                    break Loop1;
                // break;
                // continue Loop1;
                // continue;
                System.out.println(i+"*"+ j +"="+ i*j);
            }
            System.out.println();
        } // end of Loop1
    }
}
