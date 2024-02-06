import java.io.*;
import java.util.*;
public class baek_1158 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (list.size() > 0) {
            count = (count + k - 1) % list.size();
            sb.append(list.get(count)).append(", ");
            list.remove(count);
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}