import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array = new double[n];

        for(int j=0; j<array.length; j++){
            array[j] = scanner.nextInt();
        }

        scanner.close();
        
        double max = array[0];

        for(int i =0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        double sum = 0;

        for(int k=0; k<array.length; k++){

            array[k] = array[k]/max*100;          
            sum += array[k];
        } 

        System.out.println(String.format("%.2f", sum/array.length));

    }
}