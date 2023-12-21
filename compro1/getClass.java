package compro1;
import java.util.Scanner;

public class getClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float k = scanner.nextInt();
        float m = scanner.nextInt();
        float e = scanner.nextInt();

        Score s = new Score(k, m, e); // 스코어 클래스의 생성자인 Score에게 값을 전달 : (float korean, float math, float english)
        s.printScore();
    }
}

class Score{
    float korean;
    float math;
    float english;

    Score(float korean, float math, float english) {
        this.korean = korean;
        this.math = math;
        this.english = english;
    }

    Score(Score s) {
        this(s.korean, s.math, s.english);
    }

    void printScore() {
        System.out.println(korean + "\n" + math + "\n" + english);
    }
}