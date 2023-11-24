import java.util.Scanner;

public class Main{

        public static void main(String[] args) {
                //Main T = new Main();
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                int[] array = new int[50];
                array[0] = 0;
                array[1] = 1;
                for(int i =2; i<n+1; i++){
                        array[i] = array[i-1] + array[i-2];
                }
                System.out.println(array[n]);

               // System.out.println(T.fib(n));

        }
//        public int fib(int num){
//                if(num == 0) return 0;
//                else if (num == 1) return 1;
//                else{
//                        return fib(num-1) + fib(num-2);
//                }
//        }

}