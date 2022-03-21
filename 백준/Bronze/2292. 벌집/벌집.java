import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b =1, count =1;
        scanner.close();
        while(b <n){
            b+=6*(count++);
        }
        System.out.println(count);


    }
    
}