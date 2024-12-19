import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(scanner.next(), "");
        }
        int answer = 0;

        for (int i = 0; i < m; i++) {
            if(map.containsKey(scanner.next())) answer ++;
        }

        System.out.println(answer);
    }


}





