import java.util.Scanner;

public class Main {
    //init
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] number;
    static int[] ope = new int[4];
    static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        number = new int[n];

        for(int i =0; i<n; i++){
            number[i] = scanner.nextInt();
        }

        for(int i =0; i<4; i++){
            ope[i] = scanner.nextInt();
        }

        Main T = new Main();
        T.dfs(number[0], 1);

        System.out.println(max);
        System.out.println(min);

    }

    public void dfs(int num, int level){
        if(level == n){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        for(int i =0; i<4; i++){
            if(ope[i] > 0){
                ope[i]--;

                switch (i){
                    case 0 : dfs(num + number[level], level+1); break;
                    case 1 : dfs(num - number[level], level+1); break;
                    case 2 : dfs(num * number[level], level+1); break;
                    case 3 : dfs(num / number[level], level+1); break;

                }
                ope[i]++;
            }
        }
    }


}