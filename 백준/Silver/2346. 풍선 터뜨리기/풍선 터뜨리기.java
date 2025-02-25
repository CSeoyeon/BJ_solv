import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deque.add(new int[]{i + 1, scanner.nextInt()});
        }

        StringBuilder sb = new StringBuilder();
        
        while (!deque.isEmpty()) {
            int[] balloon = deque.pollFirst();
            int index = balloon[0];
            int move = balloon[1];

            sb.append(index).append(" ");

            if (deque.isEmpty()) break;

            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb);
    }
}
