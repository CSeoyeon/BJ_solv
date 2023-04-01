import java.util.*;
class Solution {
    public int solution(int num1, int num2) {
        int answer = num1/num2;
        return answer;
    }
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(T.solution(num1, num2));
    }
}