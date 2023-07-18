import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
      
        for(String x: completion){
            map.put(x, map.getOrDefault(x, 0) +1);
        }

        for(String x : participant){  
            if(map.containsKey(x)){
               map.put(x, map.get(x)-1);
            }
            if(!map.containsKey(x) || map.get(x) == -1){
                return x; 
            }
            
           
        }
        
        
        return answer;
    }
}