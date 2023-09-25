import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[] array = new int[5];
       int sum =0;
       for(int i =0; i<5; i++) {
           int k = scanner.nextInt();
           array[i] = k;
           sum+=k;
       }

       System.out.println(sum/5);
       Arrays.sort(array);
       System.out.println(array[(5/2)]);
    }

}
