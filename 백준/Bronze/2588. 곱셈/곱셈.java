import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int FN = scanner.nextInt();
        int SN = scanner.nextInt();
        int SNF =SN;
        
        while(SN>0){
            list.add(SN%10);
            SN /=10; }


        System.out.println(FN * list.get(0)); //
        System.out.println(FN * list.get(1)); //
        System.out.println(FN * list.get(2)); //
        System.out.println(FN * SNF);
    }
}
