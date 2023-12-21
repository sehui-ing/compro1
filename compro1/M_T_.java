package compro1;
import java.util.*;
public class M_T_ {
    public static void main(String[] args) {int[][] score = {
            { 100, 100, 100 },
            { 20, 20, 20 },
            { 30, 30, 30 },
            { 40, 40, 40 },
            { 50, 50, 50 },
    };
        int sum = 0;

        // score.length는 행의 개수(5)를 반환함
        for (int i = 0; i < score.length; i++) {
            // score[i].length는 i번째 행에 대한 열의 개수(3)를 반환함
            for (int j = 0; j < score[i].length; j++) {
                // printf문에서 %n은 줄바꿈, %d는 정수, %c는 문자, %s는 문자열 형식을 출력
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
                sum += score[i][j];
            }
        }
        System.out.println("sum=" + sum);

    }
}

