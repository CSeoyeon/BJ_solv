import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int[] tmp = new int[3];
        while(true){
            String answer = "";
            String line = bufferedReader.readLine();
            if(line.equals("0 0 0")) break;
            stringTokenizer = new StringTokenizer(line," ");


            int i =0;
            while(stringTokenizer.hasMoreTokens()){
                tmp[i] =Integer.parseInt(stringTokenizer.nextToken());
                i++;
            }

            Arrays.sort(tmp);
            int a = tmp[0];
            int b = tmp[1];
            int c = tmp[2];

            if(c>= a+b) answer = "Invalid";
            else if (a==b && b==c) answer = "Equilateral";
            else if((a==b && b!=c) || (b==c && a!=c) || (a==c && b!=a)) answer = "Isosceles";
            else if(a!=b && b!=c && a!=c) answer = "Scalene";



            System.out.println(answer);

        }



    }





}
