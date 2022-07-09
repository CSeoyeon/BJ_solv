import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int sum = 0;
    int i =0; 

    while(i<5){
        int score = Integer.parseInt(br.readLine());
        if(score <= 40){
            score = 40;
        }
        sum += score;
        i++;
    }
    System.out.println(sum/5);
   
    }
}
    