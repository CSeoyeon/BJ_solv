
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		
		for(int i =0; i<t; i++) {
			int answer = Integer.MIN_VALUE; 
			ArrayList<Integer> array = new ArrayList<>();
			for(int j = 0; j<10; j++) {
				array.add(scanner.nextInt());
			}
			Collections.sort(array, Collections.reverseOrder());
			answer = array.get(0);
			
			System.out.println("#" + (i+1) + " " + answer);
		}

		
		
	}
}
