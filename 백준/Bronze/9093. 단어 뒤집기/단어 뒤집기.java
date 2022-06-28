import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
     
    public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    for(int i=0; i<t; i++){
        String sen = br.readLine();
        String array[] = sen.split(" ");

        for(int j =0; j<array.length; j++){
            StringBuilder sb = new StringBuilder(array[j]);
            System.out.print(sb.reverse() + " ");
        }
        System.out.println();

        }

    }
}

    