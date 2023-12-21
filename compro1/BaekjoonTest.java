package compro1;

public class BaekjoonTest {
    public static void main(String[] args) {
        int n = 100;
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("랜덤하게 생성된 배열");
        printArray(arr);
        System.out.println();

        // 버블 정렬
        int temp;
        for (int i = n - 1; i >= 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("정렬 수행 후 배열");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println();
    }
}



