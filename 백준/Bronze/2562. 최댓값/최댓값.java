import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];

        for(int i=0; i< array.length; i++){
            array[i] = scanner.nextInt();
        }

        scanner.close();

        int max = array[0];
        int index =0;
        
        for(int j=0; j<array.length; j++){
           if(array[j] > max){
               max = array[j]; 
               index = j;
            }

        }

        System.out.println(max);
        System.out.println(index+1);
       
    }
}