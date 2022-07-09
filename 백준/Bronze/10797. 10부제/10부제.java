import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.rmi.dgc.VMID;
import java.util.StringTokenizer;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count =0;
        int day = Integer.parseInt(br.readLine());

   
        StringTokenizer st = new StringTokenizer(br.readLine());
         
       for(int i =0; i<5; i++){
            
            if(day == Integer.parseInt(st.nextToken())){
                count ++;
            }
        }
        
        System.out.println(count);
    }
}
    