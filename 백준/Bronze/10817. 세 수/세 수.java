import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int array[] = {a,b,c};
    
    for(int i=0; i<array.length -1 ;i++){
        for(int j =i+1; j<array.length; j++){
            if(array[i] >array[j]){
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
    }
    System.out.println(array[1]);
    }
}
    