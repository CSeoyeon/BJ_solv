import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum+=array[i];

            map.put(array[i], map.getOrDefault(array[i], 0)+1);
            if(maxValue<map.get(array[i])){
                maxValue = map.get(array[i]);
            }
        }

        ArrayList<Integer> mode = new ArrayList<>();
        for(int x : map.keySet()){
            if(maxValue == map.get(x)){
                mode.add(x);
            }
        }


        Arrays.sort(array);


        System.out.println((int)Math.round((double) sum/n));
        System.out.println(array[n/2]);

        if(mode.size()>=2) {
            Collections.sort(mode);
            System.out.println(mode.get(1));
        }
        else{
            System.out.println(mode.get(0));
        }


        System.out.println(array[n-1]-array[0]);



    }
}



