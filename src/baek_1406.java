import java.io.*;
import java.util.*;
public class baek_1406 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        LinkedList<String> lL = new LinkedList<>();
        String b[] =br.readLine().split("");
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(String s : b){
            lL.add(s);
        }

        ListIterator<String> iter = lL.listIterator();
        while(iter.hasNext()){
            iter.next();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char input = (st.nextToken()).charAt(0);
            if(input == 'L'){
                if(iter.hasPrevious()) iter.previous();
            }
            else if(input == 'D'){
                if(iter.hasNext()) iter.next();
            }
            else if(input == 'B'){
                if(iter.hasPrevious()){
                    iter.previous();
                    iter.remove();
                }
            }
            else{
                iter.add(st.nextToken());
            }
        }

        System.out.println(String.join("",lL));
        br.close();
    }
}
