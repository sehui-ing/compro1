package compro1;

import java.io.*;
import java.util.*;

public class Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 배열 크기(정수)를 입력하시오. ");

        int N = sc.nextInt();
        int[] array = new int[N]; // N개만큼의 배열 크기

        for (int k = 0; k < array.length; k++) { // 배열 크기만큼 반복
            array[k] = (int)(Math.random() * N); // 첫 번째부터 랜덤으로 100까지의 수 입력
        }
        int max = array[0]; // 임시로 첫 번째 값을 최댓값으로 지정
        System.out.println(Arrays.toString(array)); // 배열의 값 확인

        for(int i = 0; i < array.length; i++) { // 배열의 크기만큼 반복문 진행하면서 최댓값 찾기
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
