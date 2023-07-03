class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] removeChar = {"i", "o", "e", "a", "u"};
        
        for(String x : removeChar){
            answer = answer.replaceAll(x, "");
        }
       
        return answer;
    }
}
