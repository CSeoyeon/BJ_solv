import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
     
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     
        int t = Integer.parseInt(br.readLine());  
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++){
            sb.append(check(br.readLine())).append("\n");
           
        }  
        System.out.println(sb);
    } 

    public static String check(String data){
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<data.length(); i++){

            char d = data.charAt(i);

            if(d == '('){
                stack.push(d);
            }

            //')'가 먼저 올 경우 
            else if(stack.empty()){
                return "NO";
            }

            //')'입력시 '('를 pop (수 일치)
            else{
                stack.pop();
            }
        }
        if(stack.empty()){
            return "YES";
        }
        else{return "NO";}

    }

}

    