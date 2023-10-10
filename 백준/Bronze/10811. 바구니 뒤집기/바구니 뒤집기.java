import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] pack = new int[n];
        for(int i = 0; i<n; i++){
            pack[i] = i+1;
        }

        for(int t=0; t<m; t++){
            int i = scanner.nextInt()-1;
            int j = scanner.nextInt()-1;
            while(i<j){
                int tmp = pack[i];
                pack[i++] = pack[j];
                pack[j--] = tmp;
            }
        }

        for(int x : pack){
            System.out.print(x + " ");
        }
    }


}
