import java.io.*;
import java.util.*;
public class baek_5397 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String input;
        LinkedList<Character> lL;

        while (num-- > 0) {
            input = br.readLine();
            lL = new LinkedList<>();

            ListIterator<Character> it = lL.listIterator();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                switch (c){
                    case '<':
                        if(it.hasPrevious()) it.previous();
                        break;
                    case '>':
                        if(it.hasNext()) it.next();
                        break;
                    case '-':
                        if(it.hasPrevious()){
                            it.previous();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(c);
                }
            }

            for(Character c: lL){
                bw.write(c);
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
