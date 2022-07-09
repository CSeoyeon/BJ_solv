import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int t = Integer.parseInt(br.readLine());

    int a = 0;
    int b = 0; 
    int c = 0;


    while(true){
        if(t>= 300){
            t -= 300;
            a++;
        }
        else if(t>= 60){
           t-=60;
           b++;
        }
        else if(t>= 10){
            t-=10;
            c++;
        }

        if (t==0){
            System.out.println(a + " " + b + " " + c);
            break; 
            
        }
        else if(t%10 != 0 ){
            System.out.println(-1);
            break;
        }
    
    }

    


    }
}
    