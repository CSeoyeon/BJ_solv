import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        BigInteger n = new BigInteger(String.valueOf(scanner.nextInt()));

        System.out.println(n.multiply(BigInteger.valueOf(4)));

    }


}

