import java.util.*;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String number = "";
        HashMap<String, Long> map = new HashMap<>(){{
            put("zero", 0L);
            put("one", 1L);
            put("two", 2L);
            put("three", 3L);
            put("four", 4L);
            put("five", 5L);
            put("six", 6L);
            put("seven", 7L);
            put("eight", 8L);
            put("nine", 9L);
        }};
        
        String tmp = "";
        for(char x : numbers.toCharArray()){
            tmp += x; 
            for(String y :map.keySet()){
                if(tmp.equals(y)){
                    number += Long.toString(map.get(tmp));
                    tmp = "";
                }
        
            }
        }
        
        answer = Long.parseLong(number);
        return answer;
    }
}