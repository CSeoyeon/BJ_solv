import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i =1; i<n+1; i++){
            if(n%i ==0) arrayList.add(i);
        }

        try{
            System.out.println(arrayList.get(k-1));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(0);
        }



    }

}

