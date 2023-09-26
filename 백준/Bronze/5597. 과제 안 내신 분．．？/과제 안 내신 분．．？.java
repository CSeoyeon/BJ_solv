import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[31];
        for(int i = 0; i<28; i++ ){
            array[scanner.nextInt()]++;
        }
        for(int j =0; j<array.length; j++){
            if(array[j]==0 && j!= 0){
                System.out.println(j);
            }
        }


    }


}
