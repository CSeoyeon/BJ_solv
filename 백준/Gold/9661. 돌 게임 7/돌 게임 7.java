import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.concurrent.CopyOnWriteArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		long n = Long.valueOf(br.readLine()) % 5;
		
		String result = (n ==1 || n ==3 || n==4 ? "SK":"CY");
		
		
		System.out.println(result);
	}
}