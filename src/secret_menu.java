import java.io.*;
import java.util.*;
//
public class secret_menu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] secret = new int[M];
        int[] input = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++){
            secret[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        boolean before = false;
        boolean answer = false;
        int j = 0 ;

        for(int a = 0; a < N; a++){
            if(answer){
                break;
            }
            for(int i = a; i < N; i++){
                if(input[i] == secret[j]){
                    j++;
                    if(j == M ){
                        answer = true;
                        break;
                    }
                }
                else{
                    j = 0;
                }
            }
        }

        if(answer){
            System.out.println("secret");
        }
        else System.out.println("normal");
    }
}



