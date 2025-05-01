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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i <n; i++) {
            String tmp = scanner.next();
            if(tmp.equals("ENTER")){
               map.clear();
            }else{
                if(!map.containsKey(tmp)){
                    answer ++;
                }
                map.put(tmp, map.getOrDefault(tmp, 0)+1);
            }

        }



        System.out.println(answer);

    }
}



