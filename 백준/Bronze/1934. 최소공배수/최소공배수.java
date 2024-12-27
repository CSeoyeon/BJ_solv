import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a * b / getGCD(a, b));
        }


    }

    public static int getGCD(int n1, int n2){
        if(n2 ==0){
            return n1;
        }
        return getGCD(n2, n1%n2);
    }


}





