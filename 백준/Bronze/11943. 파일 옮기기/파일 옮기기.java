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

        StringTokenizer sta = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(sta.nextToken());
        int d = Integer.parseInt(sta.nextToken());

        System.out.println(Math.min(a+d, c+b));
        
    }
}
    