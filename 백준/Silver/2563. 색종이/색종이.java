
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[][] array = new int[100][100];
        
        for(int i =0; i<n; i++) {
        	int x = scanner.nextInt();
        	int y = scanner.nextInt();
        	
        	for(int a =x; a<10+x; a++) {
        		for(int b = y; b<10+y; b++) {
        			array[a][b] = 1; 
        		}
        	}
        	
        }
        int cnt = 0;
        for(int i=0; i<array.length; i++) {
        	for(int j =0; j<array[i].length; j++) {
        		if(array[i][j] ==1) cnt ++;
        	}
        }
        
        System.out.println(cnt);
        
    }
}