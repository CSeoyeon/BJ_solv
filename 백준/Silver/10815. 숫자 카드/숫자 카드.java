import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            hashMap.put(Integer.parseInt(st.nextToken()), 1);
        }

        int m = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            if(hashMap.containsKey(Integer.parseInt(st2.nextToken()))){
                sb.append(1);
            }
            else sb.append(0);
            sb.append(" ");
        }


        System.out.println(sb);
    }




}
