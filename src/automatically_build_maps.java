import java.io.*;

public class automatically_build_maps {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result= 2;
        for (int i = 1; i <= n; i++) {
            result = (2 * result - 1);
        }
        System.out.println(result * result);
        br.close();
    }
}
