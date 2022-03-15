import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bn = scanner.nextInt();
        scanner.close();

        int count = 0;
        int n = bn;
        while(true){
            bn = ((bn % 10) * 10)+(((bn / 10)+(bn % 10)) % 10);
            count++;
            if(n == bn){break;}
        }
        System.out.println(count);        
    }
}