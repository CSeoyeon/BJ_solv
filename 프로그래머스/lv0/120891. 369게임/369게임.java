class Solution {
    public int solution(int order) {
        int answer = 0;
        String problem = String.valueOf(order);
        
        for(char x : problem.toCharArray()){
            if(x == '3' || x == '6' || x=='9') answer ++; 
        }
        
        return answer;
    }
}