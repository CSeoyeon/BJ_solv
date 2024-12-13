import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        int num = 0;
        while (true) {
            String tmp = String.valueOf(num);
            if (tmp.contains("666")) {
                cnt++;
            }

            if (cnt == n && cnt != 0) {
                System.out.println(num);
                break;
            }

            num++;
        }


    }


}
