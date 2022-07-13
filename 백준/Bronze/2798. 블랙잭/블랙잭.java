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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m =  Integer.parseInt(st.nextToken());

        int[] card = new int[n];
        int sum, max =0; 

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    sum = card[i] + card[j] +card[k];
                if(sum <= m){
                    max = Math.max(max, sum);
                }
                if(max == m){
                    break;
                }
                }
            }
        }
      System.out.println(max);
    }

    
}
    