import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main{

    static int cnt = 0;
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String tmp = scanner.next();
            sb.append(isPalindrome(tmp)+" " + cnt+"\n");

            cnt =0;
        }

        System.out.println(sb);
    }


    public static int recursion(String s, int l, int r){
        cnt ++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

}



