import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap<>();
        
        for(int i =0; i<phone_book.length; i++){
            map.put(phone_book[i], 0);
        }
        
     
        for(String x: phone_book){
            for(int i =1; i<x.length(); i++){
                if(map.containsKey(x.substring(0, i))) return false; 
            }
            
        }
        return answer;
        
    }
}