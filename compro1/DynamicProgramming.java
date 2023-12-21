package compro1;
import java.util.*;
public class DynamicProgramming {
    private static int M, C;
    private static int[] coinArray;
    private static int[][] cache;
    private static int P = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt(); // 환전할 금액
        C = sc.nextInt(); // 동전 종류의 개수
        coinArray = new int[C]; // 동전의 종류를 담을 배열
        cache = new int[M + 1][C];
        int total = 0;

        for (int i = 0; i < C; i++) {
            coinArray[i] = sc.nextInt(); // 동전 종류 입력, 이후 배열에 담김
        }

        System.out.println(find(0, 0));
    }

    public static long find(int sum, int type) {
        if (sum == M) {
            return 1;
        }
        else if (sum > M) {
            return 0;
        }

        if(cache[sum][type] != 0) {
            return cache[sum][type];
        }
        int result = 0;

        for (int i = type; i < C; i++) {
            result += find(sum + coinArray[i], i);
        }
        return cache[sum][type] = result;
    }
}
