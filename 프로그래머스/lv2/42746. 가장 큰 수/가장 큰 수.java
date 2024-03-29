import java.util.*; 
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (o1, o2)
                   -> (o2+o1).compareTo(o1+o2));
        
        StringBuilder sb = new StringBuilder();
        
        for(String x : arr){
            sb.append(x);
        }
        
        answer = sb.toString();
        if (arr[0].equals("0")) return "0"; 
        return answer ;
    }
}