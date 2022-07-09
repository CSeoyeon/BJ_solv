import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int physics = Integer.parseInt(br.readLine());
       int chemistry = Integer.parseInt(br.readLine());
       int Biology = Integer.parseInt(br.readLine());
       int earth = Integer.parseInt(br.readLine());
       int history = Integer.parseInt(br.readLine());
       int geography = Integer.parseInt(br.readLine());

       int[] science = {physics, chemistry, Biology, earth};
       
       for(int i =0; i<science.length-1; i++){
        for(int j =1; j<science.length; j++){
            if(science[i]>science[j]){
                int temp = science[i];
                science[i] = science[j];
                science[j] = science[i];
                }
            }
        }
       
       int sum = physics + chemistry + Biology + earth + history + geography;
       sum -= ( science[0] +Math.min(history, geography)); 
       
       System.out.println(sum);
        
    }
}
    