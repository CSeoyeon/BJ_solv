import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(factorial(n)/(factorial(n-k) * factorial(k)));

    }
    public static int factorial(int n ){
        if(n ==0) return 1;
        else return factorial(n-1) * (n);
    }

}



