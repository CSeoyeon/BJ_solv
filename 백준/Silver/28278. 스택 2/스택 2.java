import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            st = new StringTokenizer(tmp, " ");
            int num = 0;
            int input = 0;
            if (st.countTokens() == 2) {
                input = Integer.parseInt(st.nextToken());
                num = Integer.parseInt(st.nextToken());
            }
            else{
                input = Integer.parseInt(st.nextToken());
            }

            switch (input){
                case 1:
                    stack.add(num);
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println(stack.pop());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()) {
                        System.out.println(stack.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;

            }

        }


    }


}









