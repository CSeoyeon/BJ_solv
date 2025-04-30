import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {


    //파스칼의 삼각형
    static int[][] array = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(br.readLine());
        Main T = new Main();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            System.out.println(T.combination(m, n));

        }


    }

    public int combination(int n, int r) {
        if (array[n][r] > 0) {
            return array[n][r];
        }

        if (r == 0 || n == r) {
            return array[n][r] = 1;

        }

        return array[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }


}



