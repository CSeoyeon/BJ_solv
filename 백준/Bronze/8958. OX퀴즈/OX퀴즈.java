import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] array = new String[n];

        for(int j=0; j<array.length; j++){
            array[j] = scanner.next();
        }

        scanner.close();
        
        for(int k=0; k < array.length; k++){
            int score = 0;
            int count = 0;
            for(int i=0; i < array[k].length(); i++){
                if( array[k].charAt(i) == 'O'){
                    count++;
                }
            
                else {
                    count = 0;
                }
                score += count;
            }
            System.out.println(score);
        }
        
    }
}