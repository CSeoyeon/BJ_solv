import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();

        System.out.println(a * b / getGCD(a, b));


    }

    public static long getGCD(long n1, long n2){
        if(n2 ==0){
            return n1;
        }
        return getGCD(n2, n1%n2);
    }


}





