import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        ArrayList<Integer> arrayList;
        while((n = Integer.parseInt(br.readLine())) != -1){
            arrayList = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                    if(n%i ==0) arrayList.add(i);
            }
            int sum =0;
            for (int x: arrayList) {
                sum += x;
            }
            if(sum != n){
                System.out.println(n + " is NOT perfect.");
            }else{
                System.out.print(n + " = ");
                for (int i = 0; i <= arrayList.size()-2; i++) {
                    System.out.print(arrayList.get(i) + " + ");
                }
                System.out.print(arrayList.get(arrayList.size()-1) + "\n") ;
            }


        }

    }

}

