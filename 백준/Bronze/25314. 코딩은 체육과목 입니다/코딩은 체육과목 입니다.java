import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String Lon = "long ";
        String in = "int";

        for(int i =0; i<n/4; i++){
            System.out.print(Lon);
        }
        System.out.println(in);
    }

}
