import java.io.*;
import java.util.*;

public class baek_3273 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] total = new int[2000001];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            total[Integer.parseInt(st.nextToken())] = 1;
        }

        int target = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 1; i <= target / 2 ; i++) {
            if(total[i] == 1){
                if(total[target - i] == 1) ans++;
            }
        }
        if(target % 2 == 0 && total[target/2] == 1) ans--;

        System.out.println(ans);
        br.close();
    }
}
