import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count =0;

        for(int i =0; i<n; i++){
            int num = scanner.nextInt();
            boolean check = true;
            // 0, 1 은 소수가 아님 
            if (num == 1 || num == 0){
               check = false; 
            } 

            for(int j =2; j<= Math.sqrt(num); j++){  
                if(num % j == 0){
                    check = false;
                }
            }    
            if(check == true){count++;}
        }
        scanner.close();
        System.out.println(count);
    }
}
        
      
