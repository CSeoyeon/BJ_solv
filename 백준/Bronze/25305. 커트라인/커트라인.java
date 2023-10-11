
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Integer[] array = new Integer[n];
        
        for(int i =0; i<n; i++) {
        	array[i] = scanner.nextInt();
        }
        
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(array[k-1]);
        
    }
}