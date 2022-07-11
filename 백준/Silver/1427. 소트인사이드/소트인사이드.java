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
        String n = br.readLine();

        char[] number = n.toCharArray();
        Arrays.sort(number);

        for(int i=number.length-1; i>=0; i--){
            System.out.print(number[i]);
        }
        
      
    }

    
}
    