import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        Main T = new Main();
        System.out.println(T.factorial(n));

    }

    public long factorial(long n){
        if(n ==0||n==1){
            return 1;
        }

        return n * factorial(n-1);
    }


}



