import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st;
        String tmp = "ChongChong";
        map.put("ChongChong", 1);
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();
            String b = st.nextToken();

            if(a.equals(tmp) || map.containsKey(a)){
                if(!map.containsKey(b)){
                    map.put(b, map.getOrDefault(b, 0)+1);
                }
                tmp = b;
            }else if(b.equals(tmp)|| map.containsKey(b)){
                if(!map.containsKey(a)){
                    map.put(a, map.getOrDefault(a, 0)+1);
                }
                tmp = a;
            }



        }


        System.out.println(map.size());

    }
}



