import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        try{
            int t = Integer.parseInt(br.readLine());
        
            for(int i=0; i < t; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int sum = a+b;

                bw.write(sum + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
    catch(IOException e){
        System.exit(0);
    }
       
        
    }
}
