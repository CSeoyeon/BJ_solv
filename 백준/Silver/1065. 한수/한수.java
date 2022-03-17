import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if(n<100){
            System.out.println(n);
        }
        else{
            int cnt =99;
            for(int i = 100; i<=n; i++){
                cnt += self(i);
            }
            if(n==1000){cnt --;}
            System.out.println(cnt);
        }
        


    }

    public static int self(int num){
        int fn = num/100 % 10;
        int sn = num/10 % 10;
        int tn = num % 10;

        if(sn *2 == fn + tn){
            return 1;
        }
        return 0;
    
    }
       

}