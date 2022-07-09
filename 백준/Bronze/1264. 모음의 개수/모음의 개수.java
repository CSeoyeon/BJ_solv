import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
       while(true){
        int cnt =0;
        String line = br.readLine();

        if(line.equals("#")){
            break;
        }
        
        line = line.toLowerCase();

        for(int i=0; i<line.length(); i++){
            switch(line.charAt(i)){
                case'a':
                case'e':
                case'i':
                case'o':
                case'u':
                    cnt++;
                default:
                    break;
            }
        }
        System.out.println(cnt);
       }

    }
}
    