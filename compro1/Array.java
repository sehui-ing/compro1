package compro1;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for (int i=0; i < 100; i++) {
            int n = (int)(Math.random() * 10); // 0~9 중의 한 값을 임의로 얻는다.
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));

        char[] hex = {'A', 'B', 'C', 'D', 'E', 'F'};

        for(char c : hex) {
            String result = ConvertToBinary(c);
            System.out.println(result);
        }
        for(int i = 0; i < hex.length; i++) {
            String result = ConvertToBinary(hex[i]);
            System.out.println(result);
        }
        //System.out.println(result);
        //A’~’F’까지의 문자가 저장된 배열 hex를 선언한다. okay
        //반복문을 통해 배열 내의 값을 1개씩 순차적으로 ConvertToBinary() 메소드의 매개변수로 전달한다. okay
        //(hex 배열 전체를 전달하지 말 것. 메소드 호출 예시: ConvertToBinary(hex[i]));
        //각 반복이 종료될 때마다 ConvertToBinary() 메소드로부터 전달받은 결과를 출력한다.
    }

    private static String ConvertToBinary(char c) {
        String[] binary = {"1010", "1011", "1100", "1101", "1110", "1111"};

        return binary [c - 'A'];
            }
    //“1010”, “1011”, “1100”, “1101”, “1110”, “1111” 값이 저장된 String 타입 배열 binary를 선언한다.
    //ConvertToBinary() 메소드는 전달받은 매개변수(‘A’ ~ ’F’)에 해당하는 이진수를 binary 배열에서 찾고
    //(“1010”, “1011”, “1100”, “1101”, “1110”, “1111” 중 1개), 그 값을 반환한다.
}