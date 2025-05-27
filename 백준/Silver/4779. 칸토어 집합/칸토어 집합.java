import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main{

    static StringBuilder answer;
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);


       String origin = "-";
       while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int len = (int) Math.pow(3, n);
            answer = new StringBuilder();
            answer.append(origin.repeat(len));

           func(0, len);
           System.out.println(answer);
        }
 

    }

    public static void func(int start, int size){
        if(size ==1){
            return;
        }
        int newSize = size/3;
        for(int i =start+newSize; i<start+2*newSize; i++ ){
            answer.setCharAt(i, ' ');
        }

        func(start, newSize);
        func(start+2*newSize, newSize);

    }





}



