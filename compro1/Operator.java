package compro1;
import java.io.*;
import java.util.*;
public class Operator {
    public static void main(String[] args) throws Exception {
        int age = 27;
        char c = 'F';
        int x = 30, y = 45;

        System.out.println((age >= 20) && (age < 30)); //괄호 안을 먼저 계산
        System.out.println((c >= 'A') && (c <= 'Z'));
        System.out.println((x >= 0) && (y >= 0) && (x <= 50) && (y <= 50));

        int a = 0;
        if (a == 0) System.out.println("a==0");
        if (a != 0) System.out.println("a!=0");
        if (!(a == 0)) System.out.println("!(a==0)");
        if (!(a != 0)) System.out.println("!(a!=0)");

        a = 1;
        if (a == 0) System.out.println("a==0");
        if (a != 0) System.out.println("a!=0");
        if (!(a == 0)) System.out.println("!(a==0)");
        if (!(a != 0)) System.out.println("!(a!=0)");

        Scanner scanner = new Scanner(System.in);
        char ch = ' ';
        System.out.printf("숫자나 알파벳을 입력하세요.>");
        String input = scanner.nextLine();

        ch = input.charAt(0); // input 변수에서 괄호안에 해당하는 순번의 문자 1개가 반환됨

        if ('0' <= ch && ch <= '9') {
            System.out.println("입력한 첫 번째 문자는: " + ch);
        } else if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("입력한 첫 번째 문자는: " + ch);
        } else {
            System.out.println("잘못된 값을 입력하였습니다.");
        }

        int score = 0;
        char grade = ' ', opt = '0';
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("시험 성적을 입력하세요 (0 ~ 100).>");
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.println("내 시험 성적은:" + grade + opt);

        int score1 = 0;
        char grade2 = ' ', opt1 = '0';
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("시험 성적을 입력하세요 (0 ~ 100).>");
        score1 = scanner.nextInt();

        switch (score / 10) {
            case 10:
            case 9:
                grade2 = 'A';
                break;
            case 8:
                grade2 = 'B';
                break;
            case 7:
                grade2 = 'C';
                break;
            case 6:
                grade2 = 'D';
                break;
            default:
                grade2 = 'F';
        }
        System.out.println(score1 + "점에 해당하는 등급은 " + grade2 + "입니다.");

        System.out.println("1~12 사이의 월(month)을 입력하세요.>");
        Scanner scanner3 = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을입니다.");
                break;
            default: //case 12: case 1: case 2:
                System.out.println("겨울입니다.");
        }

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(); // x 좌표입력
        int y1 = sc.nextInt(); // y 좌표 입력

        // 여기서부터 코드 작성
        if (x1 > 0 && y1 > 0) {
            System.out.println("1");
        } else if (x1 < 0 && y1 > 0) {
            System.out.println("2");
        } else if (x1 < 0 && y1 < 0) {
            System.out.println("3");
        } else if (x1 > 0 && y1 < 0) {
            System.out.println("4");
        }

        Scanner sc1 = new Scanner(System.in);
        int H = sc1.nextInt(); // 시
        int M = sc1.nextInt(); // 분

        if (M < 45) {
            H--;
        }
        if (H < 0) {
            H = 23;
        }
        if (M < 45) {
            M = 60 - (45 - M);
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        }
        
        Scanner sc3 = new Scanner(System.in);
        int H1 = sc.nextInt(); // 시
        int M1 = sc.nextInt(); // 분

        if (M1 < 45) {
            H1 = (H1 == 0) ? 23 : H1 - 1;
            M1 = 60 - (45 - M1);
        } else {
            M1 -= 45;
        }
        System.out.println(H + " " + M);

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}