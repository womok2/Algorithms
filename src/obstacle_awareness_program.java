import java.io.*;
import java.util.*;
public class obstacle_awareness_program {
        static int n;
        static int[][] block;
        static boolean[][] visited;
        static int count;
        static int[][] pos = {{0,1}, {0, -1}, {1,0}, {-1,0}};

        static void bfs(int x, int y){
            visited[x][y] = true;
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{x,y});

            while (!queue.isEmpty()){
                int[] arr = queue.poll();
                int nowX = arr[0];
                int nowY = arr[1];

                for(int i =0; i < 4;i++){
                    int nx = nowX + pos[i][0];
                    int ny = nowY + pos[i][1];

                    if(nx >=0 && nx < n && ny >=0 && ny < n && !visited[nx][ny] && block[nx][ny] == 1){
                        count++;
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            n = Integer.parseInt(br.readLine());
            String a;
            block = new int [n][n];
            visited = new boolean [n][n];
            boolean one = false;
            List<Integer> ans = new ArrayList<>();


            for(int i =0; i < n; i++){
                String tmp = br.readLine();
                for(int j=0; j < n; j++){
                    block[i][j] = Character.getNumericValue(tmp.charAt(j));
                    if(block[i][j] == 1) one = true;
                }
            }

            if(one = false){
                System.out.println("0");
                return;
            }

            for(int i =0; i < n; i++){
                for(int j=0; j < n; j++){
                    count = 0;
                    if(block[i][j] == 1 && !visited[i][j]){
                        count++;
                        bfs(i,j);
                        ans.add(count);
                    }
                }
            }
            System.out.println(ans.size());
            Collections.sort(ans);
            for(int i: ans){
                bw.write((i) + "\n");
            }

            br.close();
            bw.flush();
            bw.close();
        }
}
