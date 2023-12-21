package compro1;
import java.util.*;
public class Greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N명의 사람
        int[] P = new int[N]; // 각각의 사람마다 걸릴 시간을 입력할 배열
        for (int i = 0; i < N; ++i) {
            P[i] = sc.nextInt(); // 시간 입력
        }

        Arrays.sort(P); // 정렬 알고리즘
        System.out.println(Arrays.toString(P));

        int answer = 0; // 결괏값 초기화

        for (int i = 0; i < N; ++i) { // 사람 수(N)만큼 반복문 실행
            int prefixSum = 0; // 걸릴 시간 초기화
            for (int j = 0; j <= i; ++j) { // i만큼 증가하고 반복문 실행
                prefixSum += P[j]; // j번째부터 i번째까지 걸릴 시간 더하기, 처음 실행하면 1, 두 번째는 1 + 2, 세 번째는 1 + 2 + 3 ...
            }
            answer += prefixSum; // j번째부터 i번째까지 걸릴 시간을 모두 더하기, 처음 실행의 1, 두 번째 실행의 3, 세 번째 실행의 6 등을 더하기
        }
        System.out.println(answer);
    }
}