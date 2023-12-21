package compro1;

import java.sql.SQLOutput;
import java.util.*;

public class _02_DataTypes {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("hello");
        short b = 046;
        System.out.println(b);
        System.out.println((short) 0x12340151);

        char[] hex = {'C', 'A', 'F', 'E'};

        String[] binary = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        String result = "";

        for (int i = 0; i < hex.length; i++) {
            if (hex[i] >= '0' && hex[i] <= '9') {
                result += binary[hex[i] - '0'];
            } else {
                result += binary[hex[i] - 'A' + 10];
            }
        }

        System.out.println("hex:" + new String(hex));
        System.out.println("binary:" + result);

        int x = 2;
        int y = 5;
        char c = 'A';
        System.out.println(1 + x << 5);
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' - c);

        int num = 456;
        System.out.println(num - (num % 100));
        System.out.println((num / 100) * 100);

        int sum = 0;
        float average = 0f;
        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        average = sum / (float) score.length;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);

        int[] score_1 = {79, 88, 91, 33, 199, 55, 95};
        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score_1.length; i++) {
            if (score_1[i] > max) {
                max = score_1[i];
            } else if (score_1[i] < min) {
                min = score_1[i];
            }
        }
        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);

        int[] numArr = {0,1,2,3,4,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for (int i=0; i < 100; i++ ) {
            int n = (int)(Math.random() * 10); // 0~9 중의 한 값을 임의로 얻는다.
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));

        int[][] score_2 = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };
        int sum_2 = 0;

        for (int i = 0; i < score_2.length; i++) {
            for (int j = 0; j < score_2[i].length; i++) {
                System.out.printf("score_2[%d][%d] = %d%n", i, j, score_2[i][j]);
                sum += score_2[i][j];
            }
        }
        System.out.println("sum = " + sum);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하시오 > ");
        String input = sc.nextLine();

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 하나 입력해주세요 > ");
        String input1 = scanner.nextLine();

        int num12 = Integer.parseInt(input);
        int num1 = Integer.parseInt(input1);
        System.out.println("첫 번째 입력값 : " + input);
        System.out.println("두 번째 입력값 : " + input1);
        System.out.println("두 수를 더한 값은 : " + (num12 + num1));
    }
}

