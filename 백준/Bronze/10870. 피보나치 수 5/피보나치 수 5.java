import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        if(n >20){System.out.println("Error");}
        else{System.out.println(fibonacci(n));}
    }

    public static int fibonacci(int num){
        if (num <=1){return num;}
        return fibonacci(num-1) + fibonacci(num-2);

    }
}
        
      