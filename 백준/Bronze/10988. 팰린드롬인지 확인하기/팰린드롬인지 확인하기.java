
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
     Scanner scanner = new Scanner(System.in);
     String tmp = scanner.nextLine();
     char[] array = tmp.toCharArray();

     boolean check = true;

     int l = 0;
     int r = array.length-1;
     for(int  i =0; i<array.length; i++){
         if(array[l] != array[r]){
             check = false;
             break;
         }
         l++;
         r--;
     }
     if(check){
         System.out.println(1);
     }
     else{
         System.out.println(0);
     }




    }
}