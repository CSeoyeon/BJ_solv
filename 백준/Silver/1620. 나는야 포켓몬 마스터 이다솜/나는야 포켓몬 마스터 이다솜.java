import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String tmp = scanner.next();
            map.put(tmp, i+1);
            map2.put(i+1, tmp);
        }
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < m; i++) {
            String tmp = scanner.next();
            if(Character.isDigit(tmp.charAt(0))){
                sb.append(map2.get(Integer.parseInt(tmp)) + "\n");
            }
            else {
                sb.append(map.get(tmp) + "\n");
            }

        }

        System.out.println(sb);

    }


}





