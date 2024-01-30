import java.io.*;
import java.util.*;
public class baek_1926{
    static int n,m;
    static int[][] graph;
    static boolean[][] visited;
    static int count = 0;
    static int[][] pos = {{0,-1}, {0,1}, {1,0}, {-1,0}};

    static void bfs(int x, int y){
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] arr =queue.poll();
            int nowX = arr[0];
            int nowY = arr[1];

            for (int i = 0; i < 4; i++) {
                int nx = nowX + pos[i][0];
                int ny = nowY + pos[i][1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && graph[nx][ny] == 1 && !visited[nx][ny]) {
                    count++;
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx,ny});
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        List<Integer> ans = new ArrayList<>();

        graph = new int[n][m];
        visited = new boolean[n][m];
        boolean zero = true;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] == 1) {
                    zero = false;
                }
            }
        }

        if (zero == true) {
            System.out.println("0");
            System.out.println("0");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count = 0;
                if (graph[i][j] == 1 && !visited[i][j]) {
                    count++;
                    bfs(i,j);
                    ans.add(count);
                }
            }
        }
        System.out.println(ans.size());
        System.out.println(Collections.max(ans));

    }
}