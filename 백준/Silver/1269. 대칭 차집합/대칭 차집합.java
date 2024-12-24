import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int answer = 0;

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < n; i++) {
            setA.add(scanner.nextInt());
        }

        for (int i = 0; i < m; i++) {
            setB.add(scanner.nextInt());
        }

        for (int x : setA) {
            if(!setB.contains(x)) answer ++;
        }
        for (int x : setB){
            if(!setA.contains(x)) answer ++;
        }


        System.out.println(answer);
    }


}





