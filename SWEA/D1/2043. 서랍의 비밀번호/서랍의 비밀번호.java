
import java.util.Scanner;

public class Solution {

    public void calculate(int a, int b) {
        System.out.print(Math.abs(b-(a+1)));

    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        T.calculate(a, b);
    }
}
