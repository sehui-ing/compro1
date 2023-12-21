package compro1;
import java.io.*;
import java.util.*;

public class Main1 {
    private static int N, M; // N과 M을 선언
    private static int[] answer; // 정답을 출력할 배열 선언
    private static boolean[] used; // 사용된 값은 그 다음 배열에서 사용하지 않도록 하기 위해 불린 타입 선언
    private static BufferedWriter bw; // 버퍼드라이터 사용하기 위해 선언

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = sc.nextInt(); // N개의 자연수
        M = sc.nextInt(); // 선택할 개수 (M)
        used = new boolean[N + 1]; // 개수는 0번째부터 시작하기 때문에 4를 입력하더라도 3까지밖에 초기화되지 않는다. 따라서 + 1을 해 준다.
        answer = new int[M]; // M개만큼 선택하기 위한 배열
        backTracking(0);
        bw.flush(); // 버퍼드라이터가 만나서 값을 출력할 지점
        bw.close();
    }

    private static void backTracking(int depth) throws Exception {
        if (depth == M) { // 배열은 0번째부터 시작하므로 그보다 + 1인 M개의 개수가 배열에 초기화되었을 경우,
            printAnswer(); // 정답을 출력한다.
        } else {
            for (int num = 1; num <= N; num++) { // 자연수는 1부터 시작 : int num = 1, N까지 진행
                if (used[num] == true) { // 사용된 값이 있으면,
                    continue; // 건너뛰기
                }

                used[num] = true; // 사용되지 않은 값이라면 사용되었음을 알리고
                answer[depth] = num; // depth번째에 num 입력 : 1부터 2, 3, 4 등등
                backTracking(depth + 1); // 재귀함수 호출, 새롭게 백트래킹 함수를 호출하여 그 다음 값을 넣기 위한 진행
                answer[depth] = 0; // 아직 실행되지 않은 코드, 재귀함수가 호출된 만큼 새로운 함수의 실행이 끝나고 돌아와서 실행될 예정
                used[num] = false; // 사용했던 값을 사용하지 않음으로 바꾸고 다시 함수가 실행되었을 때 값을 입력할 수 있다.
            } // 백트래킹은 대칭으로 코드를 짜는 것이 의례적
        }
    }

    private static void printAnswer() throws Exception { // 정답 출력을 위한 코드
        for (int i = 0; i < M; i++) { //
            bw.write(answer[i] + " "); // bw.write 코드는 '" "'이 있어야 값을 출력할 수 있다.
        }
        bw.newLine();
    }
}