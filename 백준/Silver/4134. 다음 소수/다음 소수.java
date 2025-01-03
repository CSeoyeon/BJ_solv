import javax.swing.plaf.IconUIResource;
import java.math.BigInteger;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < n; i++) {
            BigInteger tmp = BigInteger.valueOf(scanner.nextLong());

            if(tmp.isProbablePrime(10)){
                sb.append(tmp+ "\n");
            }
            else{
                sb.append(tmp.nextProbablePrime()+ "\n");
            }



//            while(true){
//                long cnt = 0;
//                for (int j = 2; j < Math.sqrt(tmp); j++) {
//                    if(tmp % j == 0){
//                        cnt++;
//                        break;
//                    }
//                }
//                if(cnt == 0){
//                    if (tmp == 0 || tmp ==1) {
//                        sb.append(2 + "\n");
//                    }
//                    sb.append(tmp + "\n");
//                    break;
//                }
//                tmp++;
//            }


        }

        System.out.println(sb);

    }
}





