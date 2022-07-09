import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String line = br.readLine();
            if(line.equals("END")){break;}
            
            StringBuffer sb = new StringBuffer(line);
            System.out.println(sb.reverse().toString());

        }
       

        

    }
}
    