import java.io.*;
import java.util.Arrays;

public class baek_1475 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] num = new int[10];

        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - '0']++;
        }
        num[6] = (int) Math.ceil((num[6] + num[9]) / 2.0);
        num[9] = 0;

        System.out.println(Arrays.stream(num).max().getAsInt());

        br.close();

    }
}
