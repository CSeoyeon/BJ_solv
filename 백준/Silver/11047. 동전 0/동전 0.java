import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.cert.CertPathValidatorResult;
import java.util.StringTokenizer;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.security.auth.callback.ConfirmationCallback;
public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int k = Integer.parseInt(stringTokenizer.nextToken());
		
		int count = 0;
		
		int[] coin = new int[n];
		
		for(int i =0; i<n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for(int j = n-1; j>=0; j--) {
			if(coin[j] <= k) {
				count += k/coin[j];
				k = k % coin[j];
			}
		}
		
		System.out.println(count);

	
	}
}