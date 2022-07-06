import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    
    static int top = 0;
    static int[] queue;
    static int tail = -1; 

    public static int push(int data){
        queue[++tail] = data;
        return data;
    }

    public static int pop(){
        if (size() == 0){
            return -1;
        }
        else{ 
            return queue[top++]; }
    }

    public static int size(){
        return tail - top +1;
    }

    public static int empty(){
        if (size() == 0){
            return 1;
        }
        else {return 0;}
    }

    public static int front(){
        if (size() == 0){
            return -1;
        }
        else{
            return queue[top];
        }
    }

    public static int back(){
        if (size() == 0){
            return -1;
        }
        else{
            return queue[tail];
        }
    }


    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    queue = new int[n];
    
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

            case "front":
                sb.append(front()).append("\n"); 
                break;

            case "back":
                sb.append(back()).append("\n"); 
                break;

            }
            //System.out.println(sb);
            //sb.setLength(0);
           
        }

      System.out.println(sb);
    
    }
}
    