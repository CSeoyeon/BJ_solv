import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean check[] = new boolean[n+1];
        check[0] = true;
        check[1] = true;

        for(int i =2; i<Math.sqrt(n); i++){
            for(int j =2; j<=n/i; j++){
                if(check[i*j] == true){
                    continue;
                }
                else{
                    check[i*j] = true; 
                }
            }
        }

        int sub = 0; 
        int min = Integer.MAX_VALUE;

        for(int k =m; k<=n; k++){
            if(check[k] == false){
                sub += k;
                if(min > k){
                    min = k;
                }
            } 
        }

        if(sub == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sub);
            System.out.println(min);

        }
      
    }
}
        
      