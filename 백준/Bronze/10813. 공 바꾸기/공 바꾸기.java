import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] basket = new int[n+1];
        for(int i =1; i<=n; i++){
            basket[i] = i;
        }

        for(int i = 0; i<m; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int tmp = basket[b];

            basket[b] = basket[a];
            basket[a] = tmp;
        }

    for(int i =1; i<=n; i++){
        System.out.print(basket[i] + " ");
        }
    }


}
