class Solution {
    public int[] solution(int n) {
        int[] array = new int[n];
        
        int j = 0;
        for(int i =1; i<n+1; i++){
            if(i%2 != 0){
                array[j] = i;
                j++;
            }
        }
        int[] answer = new int[j];
        for(int i = 0; i<answer.length; i++){
            answer[i] = array[i];
        }
        
        return answer;
    }
}