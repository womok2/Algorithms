import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int bpWeight = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int pMetal[][] = new int[n][2];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            pMetal[i][0] = Integer.parseInt(st.nextToken());
            pMetal[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(pMetal, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int ob = 0;
        int ans = 0;
        for(int i=0; i < n; i++){

            if(bpWeight < pMetal[i][0] + ob){
                ans += (bpWeight - ob) * pMetal[i][1];
                break;
            }
            else if(bpWeight == pMetal[i][0] + ob){
                ans += pMetal[i][0] * pMetal[i][1];
                break;
            }
            else{
                ob += pMetal[i][0];
                ans += pMetal[i][0] * pMetal[i][1];
            }
        }

        bw.write(String.valueOf(ans));

        br.close();
        bw.flush();
        bw.close();

    }
}
