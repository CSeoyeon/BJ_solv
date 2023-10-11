
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char[][] array = new char[5][15]; 

        for(int i =0; i<5; i++) {
        	String tmp = scanner.nextLine(); 
        	
        	for(int j =0; j<tmp.length(); j++) {
        		array[i][j] = tmp.charAt(j);
        	}
        }
        
        for(int i =0; i<15; i++) {
        	for(int j =0; j<5; j++) {
        		if(array[j][i] == '\0') continue;
        		System.out.print(array[j][i]);
		
        	}
        }
        
    }
}