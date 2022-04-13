import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        //에라토스테네스의 체 -> 합성수를 점점 지워져나가 소수만 남게 되는 것 
        boolean[] check = new boolean[n+1];
        
        //0과 1은 소수가 아니다. 
        check[0] = true;
        check[1] = true;

        for(int i=2; i<=Math.sqrt(n); i++){
            for(int j =2; j<=n/i; j++){
                if(check[i*j] == true){
                    continue;
                }
                else{
                    check[i*j] = true;
                }
            }
        }
        
        
        for(int k=m; k<=n; k++){
            if(check[k] == false){
                bw.write(Integer.valueOf(k) +"\n");
            }
        }
        bw.flush();
        
    }
    
}
        
      