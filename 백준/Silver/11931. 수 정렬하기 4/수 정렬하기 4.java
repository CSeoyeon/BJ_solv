import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> array = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

       for(int i =0; i<n; i++){
            array.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(array, Collections.reverseOrder());

        for(int j: array){
            sb.append(j).append("\n");
        }
        
        System.out.println(sb);
        
    }
}
        
      