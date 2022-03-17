import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        for(char c = 'a'; c <= 'z'; c++){
            System.out.print(s.indexOf(c)+" ");
            
        }

    }
}