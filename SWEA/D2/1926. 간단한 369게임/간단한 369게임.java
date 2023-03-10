import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class Solution {


	public static void main(String[] args) {
		Solution T = new Solution();
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		
		for(int i =1; i<= n; i++) {
			int cnt = 0; 
			
			for(char x : String.valueOf(i).toCharArray()) {
				if(x == '3' || x=='6' || x== '9') {
					cnt ++;
				}
			}
			
			if(cnt>0) {
				for(int j = 0; j<cnt; j++) {
					System.out.print("-");
				}
			}
			else {
				System.out.print(i); 
			}
			System.out.print(" ");
			
		}

	}

}