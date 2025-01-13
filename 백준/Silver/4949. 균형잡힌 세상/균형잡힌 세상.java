import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, ".");
            while (st.hasMoreTokens()) {
                String tmp = st.nextToken();
                Stack<Character> stack = new Stack<>();
                boolean check = true;
                for (int i = 0; i < tmp.length(); i++) {
                    char x = tmp.charAt(i);

                    if ((x >= 65 && x <= 90) || (x >= 94 && x <= 122) || x == 32) {
                        continue;
                    }

                    if (x == '[') {
                        stack.push(x);
                    } else if (x == '(') {
                        stack.push(x);
                    } else if (!stack.empty()) {
                        char a = stack.peek();
                        if (a == '(' && x == ']') {
                            System.out.println("no");
                            
                            check = false;
                            break;
                        } else if (stack.peek() == '[' && x == ')') {
                            System.out.println("no");
                           
                            check = false;
                            break;
                        } else if (x == ')' || x == ']') {
                            stack.pop();
                        }
                    } else if (stack.isEmpty() && (x == ')' || x == ']')) {
                        System.out.println("no");
                        
                        check = false;
                        break;
                    }


                }

                if(check){
                    if (stack.isEmpty()) {
                        System.out.println("yes");
                       
                    } else {
                        System.out.println("no");
                        
                    }
                }

            }

        }
        

    }


}






