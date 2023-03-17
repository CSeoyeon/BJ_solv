
import java.util.Scanner;

public class Solution {

    public void calculate(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((int)(a / b));

    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        T.calculate(a, b);
    }
}
