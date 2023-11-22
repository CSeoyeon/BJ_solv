import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for(int i =0; i<n; i++){
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        int sum = 0;
        int prev =0;
        for(int i= 0; i<n; i++){
            sum += prev + array[i];
            prev += array[i];

        }
        System.out.println(sum);

    }
}






