import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  static int m;
  static int n;
  static int check[];
    static int[] p;
    static int[] combine;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m  = scanner.nextInt();
        p = new int[m];
        check = new int[n];

        Main T = new Main();
        T.dfs(0);
    }


    public void dfs(int level){
        if(level == m){
            for(int x : p){
                System.out.print(x+ " ");
            }
            System.out.println();
        }
        else{
            for(int i =0; i<n; i++){
                if(check[i] == 0){
                    check[i] =1;
                    p[level] = i+1;
                    dfs(level+1);
                    check[i] = 0;
                }

            }
        }
    }



}