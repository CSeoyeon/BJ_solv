class Solution {
    public String solution(String my_string) {
        String answer = "";
        char [] tmp = my_string.toCharArray();
     
        for(char x : tmp){
            int a = x; 
            if(x > 91){
                answer += Character.toUpperCase(x);
            }
            else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }
}