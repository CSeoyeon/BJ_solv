import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      int bep = -1;

      scanner.close();
      
      if(b>=c){
        System.out.println(bep);
      }
      else{
        System.out.println(a / (c-b) +1 );
      }
    }
}