package compro1;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 사용하기 위한 코드
        System.out.print("정수 n을 입력하시오. "); // 입력받을 수
        int input = sc.nextInt(); // 입력된 값을 int로 받기
        System.out.println("입력한 n : " + input); // 입력값 확인

        int result = Fn(input); // Fn 메서드에게 input 값을 매개변수로 전달, 그리고 Fn의 결괏값을 받아서 result에 저장
        System.out.println(result); // 저장된 result인 최종 결괏값 출력
    }

    static int Fn(int n) { // Fn 메서드는 int 타입 n을 매개변수 받고 결괏값을 int 타입으로 리턴
        if (n <= 1) {
            return n; // 숫자가 1일 경우 그냥 값이 1이기 때문에 n을 반환
        }
        else {
            int result = Fn(n - 1) + Fn(n - 2); // main 메서드와 별개로 Fn 메서드에서도 int로 result를 선언
            return result; // 값을 반환
        }
    }
}
