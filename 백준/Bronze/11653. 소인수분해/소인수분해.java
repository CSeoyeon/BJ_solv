import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
       

        for(int i =2; i<=n; i++){
            while(n%i ==0){
                if(n ==1){
                    break;
                }
                System.out.println(i);
                n = n/i;
            }

            
        }


       
    }
}
    