package compro1;
import java.util.Scanner;
public class ComputerProgramming {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello");
        System.out.println(" World");

        System.out.print("3+5=");
        System.out.println(3 + 5);

        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println(5 / 3);

        boolean hasBelief = true;

        byte x1 = 100;
        short x2 = 200;
        int x3 = 300;
        long x4 = 4000000l;

        float y1 = 100.33f;
        double y2 = 200.44;

        char ch = 'a';
        String str = "abc";

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(ch);
        System.out.println(str);

        String name = "Ja" + "va";
        String str1 = name + 8.0;

        System.out.println(name);
        System.out.println(str1);
        System.out.println(7 + 7 + "");
        System.out.println("" + 7 + 7);
        System.out.println("10 + 5 = " + (10+5));

        byte bMin = -128, bMax = 127;
        short sMin = -32768, sMax = 32767;

        System.out.println("bMin = " + bMin);
        System.out.println("bMax = " + bMax);
        System.out.println("sMin = " + sMin);
        System.out.println("sMax = " + sMax);

        int x12 = 10, y12 = 5;
        System.out.println("x12="+x12);
        System.out.println("y12="+y12);
        int temp = x12;
        x12 = y12;
        y12 = temp;
        System.out.println("x12=" + x12);
        System.out.println("y12=" + y12);

        final double PI = 3.14;
        final int MAX_SPEED;
        MAX_SPEED = 1000;

        System.out.println(PI);
        System.out.println(MAX_SPEED);

        byte binary1 = 0b00001111;
        byte binary2 = 0b1010;
        short binary3 = 0b100000001;

        System.out.println(binary1);
        System.out.println(binary2);
        System.out.println(binary3);

        byte asd = 0b111001;
        byte asdf = 0b1101100;
        short asdfg = 0b11100111;

        System.out.println(asd);
        System.out.println(asdf);
        System.out.println(asdfg);

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 하나 입력해 주세요.>");
        String input = scanner.nextLine();
        System.out.print("정수를 하나 더 입력해 주세요.>");
        String input1 = scanner.nextLine();

        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
        int num1 = Integer.parseInt(input1); // 입력받은 문자열을 숫자로 변환

        System.out.println("두 수를 더한 값은 : " + (num + num1)); // 문자열을 정수형으로 변환계산 하기 위해 '()' 표시

        System.out.println((short)0x12340151);

        // TODO Auto-generated method stub
        short x = 0b100101100; // 4 + 8 + 32 + 256
        short y = 0b111111110; // 2 + 4 + 8 + 16 + 32 + 64 + 128 + 256
        short z = 0b101110110; // 2 + 4 + 16 + 32 + 64 + 256

        short a = 0454; // 8진수는 0으로 시작하며 이진수를 3비트씩 묶어서 1자리로 표현
        short b = 0776;
        short c = 0566;

        System.out.println(""+ x + y + z);
        System.out.println(""+ a + " " + b + " " + c);

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}