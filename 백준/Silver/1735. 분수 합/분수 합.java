import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int an = scanner.nextInt();
        int ad = scanner.nextInt();
        int bn = scanner.nextInt();
        int bd = scanner.nextInt();

        int n = (an * bd) + (bn * ad);
        int d  = ad * bd;

        int gcd = getGCD(n, d);


        System.out.println(n/gcd + " " + d/gcd);


    }


    public static int getGCD(int a, int b){
       if(a % b == 0){
           return b;
       }
       return getGCD(b, a%b);
    }

}





