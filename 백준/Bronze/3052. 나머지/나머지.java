import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for(int j=0; j<array.length; j++){
            array[j] = (scanner.nextInt())%42;
        }

        scanner.close();
        int count = 0; 

        for(int i =0; i<array.length; i++){
            boolean bl = true;
            for(int k=i+1; k<array.length; k++){
                if(array[i] == array[k]){
                    bl = false;
                }
            }
            if (bl == true){
                count +=1;
            }    
        }
        
        System.out.println(count);
    }
}