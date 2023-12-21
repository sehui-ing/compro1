package compro1;
import java.util.*;
public class Backtrackking {
    static int w[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int target;
    static int x[] = new int[10];

    public static void main(String[] args) {
        int total = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("검사할 숫자 입력 ");
        target = s.nextInt();

        for (int i = 0; i < w.length; i++) {
            total += w[i];
        }
        sum_subset(-1, 0, total);
    }

    public static void sum_subset(int i, int weight, int total) {
        if (target == weight) {
            print();
        }
        else {
            if (weight + total < target || (weight + w[i + 1] < target))
                return;

            x[i + 1] = w[i + 1];
            sum_subset(i + 1, weight + w[i + 1], total - w[i + 1]);

            x[i + 1] = 0;
            sum_subset(i + 1, weight, total - w[i + 1]);
        }
    }

    public static void print() {
        for (int i = 0; i < x.length; i++) {
            if (x[i] != 0) {
                System.out.println(x[i]);
            }
        }
        System.out.println();
    }
}
