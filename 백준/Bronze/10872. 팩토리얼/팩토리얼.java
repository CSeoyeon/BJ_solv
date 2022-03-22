import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n == 0){
            System.out.println(1);
        }
        else{
            int k =1;
            for(int i =1; i<=n; i++){
                k *= i;
            }
            System.out.println(k);
        }
    }
}