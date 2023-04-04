import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        
        int[] value = new int[1001];
        int tmp =Integer.MIN_VALUE; 
        for(int i=0; i<array.length; i++){
            value[array[i]] ++;
             
        }
        
        for(int i =0; i< value.length; i++){
            if(tmp < value[i]){  
                tmp = value[i];
                answer = i;
            }
        }
        for(int i=0; i<value.length; i++){
            if(tmp == value[i] && answer != i) return -1;
        }
        
        return answer ;
    }
}