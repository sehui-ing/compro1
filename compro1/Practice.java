package compro1;
import java.io.*;
import java.util.*;
public class Practice {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 3
        int M = Integer.parseInt(st.nextToken()); // 1

        for (int i = 0 ; i < 10; ++i ){
            bw.write("" + i);
        }

        br.readLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
