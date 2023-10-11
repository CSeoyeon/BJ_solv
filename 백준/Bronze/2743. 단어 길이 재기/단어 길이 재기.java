import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int tmp = 0;
        for(char x : s.toCharArray()){
            tmp ++;
        }
        System.out.println(tmp);




    }

}