import java.io.*;
import java.util.*;

public class baek_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int[] alphabet = new int[26];

        for(int i = 0; i < s.length(); i++){
            alphabet[s.charAt(i) - 'a'] ++;
        }
        for(int i: alphabet){
            bw.write(i + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
