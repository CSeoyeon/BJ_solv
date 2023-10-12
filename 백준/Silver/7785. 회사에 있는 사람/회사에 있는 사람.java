import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String state = scanner.next();
            if(map.containsKey(name)) map.remove(name);
            else map.put(name, state);
        }
        ArrayList<String> arrayList = new ArrayList<>(map.keySet());
        Collections.sort(arrayList, Collections.reverseOrder());
        for (String x: arrayList
             ) {
            System.out.println(x);

        }

    }
}