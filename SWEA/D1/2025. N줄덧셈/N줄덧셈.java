
import java.util.Scanner;

public class Solution {

    public void calculate(int a) {
        System.out.println(a*(a+1)/2);

    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        T.calculate(a);
    }
}
