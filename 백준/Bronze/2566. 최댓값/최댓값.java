
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[9][9];
       
        int num = Integer.MIN_VALUE;
        int w = 0; //행
        int h = 0; //열
        
        for(int i=0; i<9; i++) {
        	for(int j =0; j<9; j++) {
        		array[i][j] = scanner.nextInt();
        		if(num <array[i][j]) { 
        			num = array[i][j];
        			w = i+1;
        			h = j+1;
        		}
        	}
        }
        
        System.out.println(num);
        System.out.printf("%d %d", w, h);
        
        
        
        
        
        


    }
}