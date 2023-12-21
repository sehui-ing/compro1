package compro1;
import java.util.*;
public class GreedyTest {
    public static void main(String[] args) {
        // 2명의 여학생과 1명의 남학생으로 팀 결성
        // N명의 여학생과 M명의 남학생 이중 K명은 인턴십에 참여, 인턴십 참여자는 대회 참여 불가
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        // 팀을 N과 M의 관계를 이용해서 먼저 구해 놓기
        int team = (N/2) > M ? M : (N/2);
        int intern = N + M - (team * 3);

        // 팀 안 되고 남은 사람 수(인턴십 참여)가 K보다 크도록 하면서 -3(팀의 수)씩
        while (intern < K) {
            team -= 1;
            intern += 3;
        }
        System.out.println(team);
    }
}