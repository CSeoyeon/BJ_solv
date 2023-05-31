class Solution {
    public String solution(int age) {
        String answer = "";
        String[] array = (Integer.toString(age)).split("");
        
        for(int i = 0; i<array.length; i++){
            answer += (char)(Integer.parseInt(array[i])+97);
        }
        
        return answer;
    }
}