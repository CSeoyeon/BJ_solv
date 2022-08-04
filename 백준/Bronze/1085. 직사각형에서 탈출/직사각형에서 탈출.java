import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.concurrent.CopyOnWriteArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(stringTokenizer.nextToken());
		int y = Integer.parseInt(stringTokenizer.nextToken());
		
		int w = Integer.parseInt(stringTokenizer.nextToken());
		int h = Integer.parseInt(stringTokenizer.nextToken());
		
		int minX = Math.min(x, w-x);
		int minY = Math.min(y, h-y);
		
		System.out.println(Math.min(minX, minY));
		
	
	}
}