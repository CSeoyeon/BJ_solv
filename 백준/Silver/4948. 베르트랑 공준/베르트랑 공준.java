import javax.swing.plaf.IconUIResource;
import java.math.BigInteger;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main T = new Main();
        int n;

        while ((n = scanner.nextInt()) != 0) {
            if(n ==1) System.out.println(1);
            else System.out.println(T.getPrimeNumber(n));
        }

    }

    public int getPrimeNumber(int n) {
        int answer = 0;
        int number = n+1;
        while (true) {
            if(number == n*2) break;
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n*2); i++) {
                if(number == i) continue;
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if(check==true) answer ++;
            number++;
        }
        return answer;

    }
}





