import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();

        for(int i=0; i<c; i++){
            int student = scanner.nextInt();
            int[] score = new int[student];

            int sum = 0;
            double mean = 0;
            int count =0; 

            for(int j=0; j<student; j++){
                score[j] = scanner.nextInt();
                sum += score[j];
            }

            mean = sum / student;
            for(int k =0; k<student; k++){
                if(score[k] > mean){
                    count ++; 
                }
            }
            // System.out.printf("%.3f%%", (double)count/student*100);
            System.out.printf("%.3f", (double)count/student*100);
            System.out.println("%");

        }

        scanner.close();
        
    
        
    }
}
