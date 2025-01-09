import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        int gcd = 0;
        for (int i = 0; i < n-1; i++) {
            int tmp = array[i+1] - array[i];
            //거리의 간격마다 최대공약수
            gcd = getGcd(tmp, gcd);
        }



        System.out.println((((array[n-1]-array[0])/gcd)-(array.length))+1);


    }

    public static int getGcd(int a, int b){
        if(b==0) return a;
        return getGcd(b, a%b);
    }
}









