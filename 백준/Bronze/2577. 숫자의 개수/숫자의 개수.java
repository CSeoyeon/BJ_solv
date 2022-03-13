import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int value = a * b * c;
        
        while(value >0){
            array[value%10]++;
            value /= 10;
        }
        
        for(int i =0; i<10; i++){
            System.out.println(array[i]);
        }
    }
}