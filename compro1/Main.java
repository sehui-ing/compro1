package compro1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)
        System.out.println();
        for (int i = 0; i < T; i++) {
            int n1 = scanner.nextInt(); // 입력값1
            int n2 = scanner.nextInt(); // 입력값2
            System.out.println();

            if (n2 > n1) {
                int tmp = n2;
                n2 = n1;
                n1 = tmp; // 최댓값 지정
            }


            int result = gcd(n1, n2);
            System.out.println(result); // 최대공약수, 나눌 값
            System.out.println((n1 * n2) / result); // 두 수의 곱 나누기 두 수의 최대공약수 = 최소공배수
            System.out.println(); // 최소공배수 첫 번째 방법 : 그냥 두 수를 곱하고 최대공약수로 나눠 주는 방법


            int A = n1 / result; // 최대공약수로 두 수를 나눠서 몫 구하기
            int B = n2 / result;
            System.out.println(A);
            System.out.println(B);

            int M = A * B * result; // 최소공배수 두 번째 방법 : 두 수의 최대 공약수 * 위에서 구한 두 수의 몫
            System.out.println(M);
        }
    }

    public static int gcd(int x, int y){
        if (y == 0) return x;
        else return gcd(y, x % y);
    }
}