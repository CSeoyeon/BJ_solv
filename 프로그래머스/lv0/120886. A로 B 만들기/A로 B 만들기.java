class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] aArray = new int[26];
        for(char x : before.toCharArray()){
            aArray[x-97]++; 
        }
        for(char x: after.toCharArray()){
            aArray[x-97]--;
        }
        for(int i =0; i<aArray.length; i++){
            if(aArray[i] != 0){
                return 0;
            }
        }
        
        return answer;
    }
}