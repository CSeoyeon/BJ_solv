import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] array = s.split("");
        
        Arrays.sort(array, Collections.reverseOrder());
        
        for(String x : array){
            answer += x;
        }
        
        return answer;
    }
}