package compro1;

import java.util.Scanner;

class Assignment {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  System.out.printf("연도를 입력하세요. >>");
String input = scanner.nextLine();
int year = Integer.parseInt(input);

// 삼항연산자 (? :)와 나누기 연산자(/), 나머지 연산자 (%), 논리연산자 (&&, ||), 비교연산자 (==, !=)를 적절히 활용
String result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "윤년" : "평년";
//여기에 코드 작성 (한 줄로 해결 가능)
System.out.println(result);
    }
}
