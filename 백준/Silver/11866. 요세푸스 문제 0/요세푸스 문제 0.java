import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        int i = 1;

       StringBuilder sb= new StringBuilder();
       sb.append("<");
        while(!queue.isEmpty()){
            if( i != k){
                queue.addLast(queue.pollFirst());
            }
           if(i==k){
               sb.append(queue.poll() + ", ");
               i = 0;
           }
            i++;
        }

        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.println(sb);

    }
}







