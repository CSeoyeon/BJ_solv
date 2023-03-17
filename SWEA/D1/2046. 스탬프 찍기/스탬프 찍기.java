
import java.util.Scanner;

public class Solution {

    public void calculate(int a) {
        for(int i =0 ; i<a; i++){
            System.out.print("#");
        }

    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        T.calculate(a);
    }
}
