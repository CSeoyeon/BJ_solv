import java.util.Scanner;




public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sx = Integer.MAX_VALUE;
        int bx = Integer.MIN_VALUE;
        int sy = Integer.MAX_VALUE;
        int by = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(x < sx) sx = x;
            if(x > bx) bx = x;
            if(y < sy) sy = y;
            if(y > by) by = y;
        }

        System.out.println((bx-sx)*(by-sy));




    }





}
