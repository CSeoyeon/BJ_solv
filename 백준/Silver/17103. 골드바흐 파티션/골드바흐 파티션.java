import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //소수
        int[] array = new int[1000001];
        array[0] = array[1] = 1;
        for(int i = 2; i * i<= 1000000; i++){
            if(array[i] != 1){
                for(int j = i+i; j<= 1000000; j+= i){
                    array[j] =1 ;
                }
            }
        }


        for(int i = 0; i<n; i++){
            int num = scanner.nextInt();
            int answer = 0;

            for (int j = 2; j <= num/2; j++) {
                if(array[j] == 0 && array[num-j] == 0){
                    answer ++;
                }

            }
            System.out.println(answer);


        }

    }



}





