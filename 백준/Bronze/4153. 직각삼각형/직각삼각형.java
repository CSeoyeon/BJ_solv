import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = (int)Math.pow(Integer.parseInt(st.nextToken()), 2);
            int b = (int)Math.pow(Integer.parseInt(st.nextToken()), 2);
            int c = (int)Math.pow(Integer.parseInt(st.nextToken()), 2);
            

            //&, |는 조건식의 결과가 결정되어도 모든 조건을 끝까지 검사한다.  
            if (a ==0 && b ==0 && c ==0){
                break;
            }
            else if((a==b+c)| (b==c+a) | (c==a+b)){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
        }
        
        
    }
}
        
      