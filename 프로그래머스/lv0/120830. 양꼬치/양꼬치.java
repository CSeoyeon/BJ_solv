class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int meat = 12000;
        int drink = 2000;
         answer = meat * n + drink * k;
        if(n >= 10){
              answer -= 2000 * (n/10) ;
        }
        
        return answer;
    }
}