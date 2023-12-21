package compro1;
import java.util.*;
public class Test_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        String str = ""; // 여기에 짝수인지 홀수인지 저장

        if(1 <= num && num <= 3) {
            str = "입력하신 월은 겨울입니다.";
        } else if (4 <= num && num <= 6) {
            str = "입력하신 월은 봄입니다.";
        } else if (7 <= num && num <= 9) {
            str = "입력하신 월은 여름입니다.";
        } else if(10 <= num && num <= 12) {
            str = "입력하신 월은 가을입니다.";
        } else {
            str = "잘못된 값을 입력하였습니다.";
        }
        System.out.println(str);
    }
}
