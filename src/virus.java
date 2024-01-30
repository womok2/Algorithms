import java.io.*;
import java.util.*;

public class virus {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K, P, N;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long ans;

        K = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        ans = (K % 1000000007);
        for(int i=0;i < N; i++){
            ans = (ans * (P % 1000000007)) % 1000000007;
        }

        System.out.println(ans);
    }
}
