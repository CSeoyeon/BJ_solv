import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int array[] = new int[n];

        for(int i =0; i<n; i++){
            array[i] =scanner.nextInt();
        }

        for (int i=0; i<n; i++){
            if(array[i] < x){
                System.out.printf("%d ",array[i]);
            }
        
        }
    }
}