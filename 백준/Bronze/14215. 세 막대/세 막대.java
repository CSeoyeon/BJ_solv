import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] array = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        Arrays.sort(array);

        if(array[2] >= array[1] + array[0]){
            System.out.println(2*(array[1] + array[0]) - 1);
        }

        else System.out.println(array[1] + array[0] + array[2]);



    }





}
