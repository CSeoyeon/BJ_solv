import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Long, Integer> map1 = new HashMap<>();
        for(int i =0; i<n; i++){
            map1.put(scanner.nextLong(), i);
        }

        int m = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<m; i++){
            if(map1.get(scanner.nextLong()) != null){
                sb.append(1+ " ");
            }
            else sb.append(0+ " ");
        }
        System.out.println(sb);


    }
}