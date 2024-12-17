import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        int[] array = new int[n];
        int[] sorted = new int[n];

        HashMap<Integer, Integer> ranking  = new HashMap<>();

        String number = br.readLine();
        StringTokenizer st = new StringTokenizer(number, " ");
        for (int i = 0; i < n; i++) {

            array[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        int rank = 0;
        for(int x : sorted){
            if(!ranking.containsKey(x)){
                ranking.put(x, rank);
                rank ++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int x : array){
            sb.append(ranking.get(x)).append(" ");
        }

        System.out.println(sb);

    }



}
