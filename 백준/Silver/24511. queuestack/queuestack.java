import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        int[] queueStack = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            if(queueStack[i] == 0) deque.addLast(array[i]);
        }

        int m = Integer.parseInt(br.readLine());
        int[] array2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder sb  = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int x = array2[i];
            deque.addFirst(x);
            sb.append(deque.pollLast()).append(" ");

        }
        System.out.println(sb);

    }


}







