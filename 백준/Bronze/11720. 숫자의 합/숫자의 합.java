import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String b = scanner.next();
        scanner.close();  
        int sum = 0;

        for(int i =0; i<a; i++){
            //'-0' or -48
            sum+= b.charAt(i)-'0';
        }
        System.out.println(sum);

    }
}