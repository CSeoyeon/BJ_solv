import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        
        // 분자에 b(down)를 마이너스 해주는 이유 
        // 낮에 a(up)로 v(가야하는 길이)에 도달하였지만, 분모의 b로 인하여 v에 도달할 수 없을 가능성 있음  
        int day = (v-b) /(a-b); 
        if ((v-b) %(a-b) != 0){
            day ++;
        }
        System.out.println(day);
            
    }
       
    
}
        
      
