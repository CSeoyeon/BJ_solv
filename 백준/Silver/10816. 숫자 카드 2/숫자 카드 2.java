import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Long tmp = scanner.nextLong();
            map.put(tmp, map.getOrDefault(tmp, 0)+1);
        }

        int m = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            Long tmp = scanner.nextLong();
            if(map.containsKey(tmp)){
                sb.append(map.get(tmp) +" ");
            }
            else sb.append(0 + " ");
        }

        System.out.println(sb);

    }
}