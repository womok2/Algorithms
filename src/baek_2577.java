import java.io.*;
import java.util.*;

public class baek_2577 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] number = new int[10];

        String s = Integer.toString(a*b*c);
        for(int i = 0; i < s.length(); i++){
            number[s.charAt(i) - '0'] ++;
        }
        for(int i: number){
            bw.write(i + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
