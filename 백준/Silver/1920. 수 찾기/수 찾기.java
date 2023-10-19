import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public int solution(int n, int[] array, int number){
        int answer = 0;

        int lt = 0;
        int rt = n-1;

        while(lt <= rt){
            int mid = (lt + rt)/2;
            if(array[mid] == number ){
                answer = 1;
                break;
            }
            else if(array[mid] > number) rt = mid -1;
            else if(array[mid] < number) lt = mid +1;
        }

        return answer;
    }


    public static void main(String[] args){
       Main T= new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i =0; i<n; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int m = scanner.nextInt();

        for(int i =0; i<m; i++){
            System.out.println(T.solution(n, array, scanner.nextInt()));
        }






    }



}






