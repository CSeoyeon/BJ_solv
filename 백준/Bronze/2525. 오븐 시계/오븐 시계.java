import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int cookTime = scanner.nextInt();

        int tm = hour*60 + minute +cookTime;
        hour = tm/60;
        minute = tm%60;

        if(hour>=24){
            hour -=24;
        }
        System.out.printf("%d %d",hour,minute);
        
    }
}
