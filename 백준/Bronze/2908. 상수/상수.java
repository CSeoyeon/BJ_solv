import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        scanner.close();
        
        String reversA = new StringBuffer(a).reverse().toString(); 
        String reversB = new StringBuffer(b).reverse().toString();

        int sa = Integer.parseInt(reversA);
        int sb = Integer.parseInt(reversB);
        if(sa> sb){
            System.out.println(sa);
        }
        else{System.out.println(sb);}
       
    }
}