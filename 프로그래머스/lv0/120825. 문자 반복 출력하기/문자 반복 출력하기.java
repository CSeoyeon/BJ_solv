class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] string = my_string.toCharArray();       
        
        for(char x : string){
            for(int i=0; i<n; i++){
                answer += (String.valueOf(x));
            }
        }
        
        return answer;
    }
}