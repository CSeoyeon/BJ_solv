
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int[] p;
    static StringBuilder sb= new StringBuilder();


    public void dfs(int level){
        if(m == level){
            for (int x: p) {
                sb.append(x).append(' ');
            }
            sb.append('\n');
        }
        else{
            for(int i =0; i<n; i++){
                p[level] = i+1;
                dfs(level+1);


            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        p = new int[m];


        Main T = new Main();
        T.dfs(0);

        System.out.println(sb);

    }
}

