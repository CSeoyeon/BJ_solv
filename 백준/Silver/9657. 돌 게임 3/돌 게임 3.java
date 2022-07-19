import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String result = ((n % 7 == 0) ||(n % 7 ==2) ? "CY":"SK");
		System.out.println(result);
	}
}
