import java.io.*;
import java.util.*;

public class gBC {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] limit = new int[101];
        int[] test = new int[101];

        int start = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j = start; j < start + a; j++) {
                limit[j] = b;
            }
            start +=a;
        }

        int start2 = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j = start2; j < start2 + a; j++) {
                test[j] = b;
            }
            start2 +=a;
        }

        int max_speed = 0;
        for (int i = 0; i < 101; i++) {
            max_speed = Math.max(test[i] - limit[i], max_speed);
        }
        System.out.println(max_speed);
    }
}
