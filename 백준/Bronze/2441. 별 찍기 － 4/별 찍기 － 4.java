import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int k=0;
        for(int i = n; 0<i; i--){
            System.out.print(" ".repeat(k));
            System.out.print("*".repeat(i));
            k++;
            System.out.println();
        }

    }
}
    