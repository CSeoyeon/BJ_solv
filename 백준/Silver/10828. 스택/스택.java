import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//stack 을 import 해서 쓸 수도 있으나.. 
public class Main {
    static int top = 0;
    static int[] stack;
    
    public static void push(int data){
        stack[top] = data;
        top ++; 
    }

    public static int pop(){
        if(top ==0){return -1;}
        else{
            //push를 하면 가리키는 공간이 다음으로 이동하기에 (top++로 인하여)
            int popNum = stack[top-1];
            stack[top-1] = 0;
            top --;
            return popNum;}
    }

    public static int size(){
        return top;
    }

    public static int empty(){
        if(top == 0){return 1;}
        else{return 0;}
    }
    public static int top(){
        if(top == 0){return -1;}
        else{return stack[top-1];}
    }

   
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());  
        stack = new int[n];
        for(int i=0; i<n; i++){

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append("\n"); 
                    break;

                case "size":    
                    sb.append(size()).append("\n"); 
                    break;

                case "empty":
                    sb.append(empty()).append("\n");
                    break;

                case "top":
                    sb.append(top()).append("\n"); 
                    break;

            }
           
            //string builder 초기화
            //sb.setLength(0);
        }    
        System.out.println(sb);
    } 

}

    