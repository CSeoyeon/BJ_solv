import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int tmp = -1;
        
        for(int x: arr){
           if(tmp != x)
               list.add(x);
            tmp = x; 
        }
    
        
        return list;
    }
}

// 효율성 채점에서..x 
//         String str = Arrays.toString(arr).replaceAll("[^0-9]", "");
//         String tmp = "";
        

//         char k = 'a';
//         for(char x: str.toCharArray()){
//             if(k!=x){
//                 tmp +=x;
//                 k =x;
//             }
//         }
//        int[] answer = new int[tmp.length()];
//         for(int i =0; i<tmp.length(); i++){
//             answer[i] =  Character.getNumericValue(tmp.charAt(i));
//         }
        