import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] basket = new int[n];
        for(int i =0; i<m; i++){
            int start = scanner.nextInt();
            int finish = scanner.nextInt();
            int ball = scanner.nextInt();
            for(int j = start-1; j<finish; j++){
                basket[j] = ball;
            }
        }

        for(int i : basket){
            System.out.print(i +" ");
        }
    }

}
