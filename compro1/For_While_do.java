package compro1;
import java.util.*;
public class For_While_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 정수를 입력하세요 > ");
        int input = sc.nextInt();

        for (int i = input; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < input - i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = input - 1; i > 0; i--) {
            for (int k = 0; k < input - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}