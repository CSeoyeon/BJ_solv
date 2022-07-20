import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.concurrent.CopyOnWriteArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//BigInteger n = new BigInteger(br.readLine());
		
		Long n = Long.valueOf(br.readLine());
		
		String result = (n % 2 == 1 ) ? "SK":"CY";
		
		
		System.out.println(result);
	}
}