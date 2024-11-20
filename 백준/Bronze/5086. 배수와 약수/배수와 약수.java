import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        String read;
        StringTokenizer st;
        while((read = br.readLine()) != null){
            st = new StringTokenizer(read, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0){
                break;
            }
            else if(b % a == 0){
               System.out.println("factor");
            }
           else if(a % b ==0){
               System.out.println("multiple");
           }
           else{
               System.out.println("neither");
           }



        }


    }


}

