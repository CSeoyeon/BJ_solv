class Solution {
    public int solution(int num, int k) {
        int answer = 1;
        String a = String.valueOf(num);
        
        for(char x : a.toCharArray()){
            //10은 10진수 
            if(x== Character.forDigit(k, 10)){
                break;
            }   
            answer++; 
        }
        if(answer > a.length()){
            return -1;
        }
        return answer;
    }
}