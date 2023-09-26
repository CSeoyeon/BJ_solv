import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int[] array = new int[n];

       for(int i =0; i<n; i++){
           array[i] = scanner.nextInt();
       }

       int v = scanner.nextInt();
       int sum =0;
       for(int i =0; i<n; i++){
           if(array[i] == v){
               sum++;
           }
       }
        System.out.println(sum);
    }

}
