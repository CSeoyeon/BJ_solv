import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
     
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int x = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());

    
    int charge = 0;

    for(int i = 0 ; i < n; i++){
            String[] list = br.readLine().split(" ");
            int price = Integer.parseInt(list[0]);
            int count = Integer.parseInt(list[1]);
            charge += price * count;
        }
            
        if(charge == x){
            System.out.println("Yes");
        }
        else{System.out.println("No");
        }


    }
}

    