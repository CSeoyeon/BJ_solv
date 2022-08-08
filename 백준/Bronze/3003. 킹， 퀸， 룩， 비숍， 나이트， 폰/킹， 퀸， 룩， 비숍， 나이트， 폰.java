import java.awt.Frame;
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
		
		int[] array = {1, 1, 2, 2, 2, 8};
		int [] userArray = new int[6];
		
		for(int i =0; i<6; i++) {
			userArray[i] =  Integer.parseInt(stringTokenizer.nextToken());
		}
		
		
		for(int k =0; k<6; k++) {
			System.out.print(Math.subtractExact(array[k], userArray[k]) + " ");
		}
		
	}
}