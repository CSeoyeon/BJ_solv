import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.next());
        }

        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < m; i++) {
            String tmp = scanner.next();
           if(set.contains(tmp)){
              arrayList.add(tmp);
           }
        }

        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for (String x: arrayList) {
            System.out.println(x);
        }

    }


}





