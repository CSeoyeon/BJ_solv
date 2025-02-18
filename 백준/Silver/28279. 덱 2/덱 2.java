import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static Deque<Integer> deque = new ArrayDeque<>();
    public static void main(String[] args) throws IOException{

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            st = new StringTokenizer(tmp, " ");
            if(st.countTokens() >= 2){
                int input = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                T.dequeFunction(input, num);

            }else{
                int input = Integer.parseInt(st.nextToken());
                System.out.println(T.dequeFunction(input));
            }

        }


    }

    public int dequeFunction(int a){
        int answer = 0;
        switch(a){
            case 3:
                if(!deque.isEmpty()){
                    answer = deque.pollFirst();
                }else{
                    answer = -1;
                }
                break;
            case 4:
                if(!deque.isEmpty()){
                    answer = deque.pollLast();
                }else{
                    answer = -1;
                }
                break;
            case 5:
                answer = deque.size();
                break;
            case 6:
                if(!deque.isEmpty()){
                    answer = 0;
                }else{
                    answer = 1;
                }
                break;
            case 7:
                if(!deque.isEmpty()){
                    answer =deque.getFirst();
                }else{
                    answer = -1;
                }
                break;
            case 8:
                if(!deque.isEmpty()){
                    answer = deque.getLast();
                }else{
                    answer = -1;
                }
                break;
        }
        return answer;

    }
    public void dequeFunction(int a, int b){
        switch(a){
            case 1:
                deque.addFirst(b);
                break;
            case 2:
                deque.offerLast(b);
                break;

        }

    }

}







