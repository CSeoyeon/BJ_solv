import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int FN = scanner.nextInt();
        int SN = scanner.nextInt();

        if(FN>0){
             if(SN>0){
                System.out.println("1"); 
                }
            else if(SN<0){
                System.out.println("4");
            }
        }
        else if(FN<0) {
            if(SN>0){
                System.out.println("2");
            }
           else if(SN<0){
               System.out.println("3");
           }
        }
    }
}
