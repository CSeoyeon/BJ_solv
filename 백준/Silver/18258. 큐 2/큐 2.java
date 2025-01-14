import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int back =0;
        StringTokenizer st;
        while(n--> 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    queue.offer(Integer.valueOf(st.nextToken()));
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        sb.append(queue.poll() + "\n");
                    } else sb.append(-1 +"\n");
                    break;
                case "size":
                    sb.append(queue.size()+ "\n");
                    break;
                case "empty":
                    if (!queue.isEmpty()) {
                        sb.append(0+"\n");
                    } else sb.append(1 +"\n");
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        sb.append(queue.peek()+"\n");
                    } else sb.append(-1 +"\n");
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        sb.append(queue.peekLast()+"\n");
                    } else sb.append(-1 +"\n");
                    break;
            }

        }
        System.out.println(sb);
    }


}






