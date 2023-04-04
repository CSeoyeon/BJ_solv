class Solution {
    public int compute(int numer, int denom){
        if(numer%denom ==0){
            return denom;
        }
        else 
            return compute(denom, numer%denom);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int denom_A = denom1 * denom2; 
        int tmp1 = denom_A /denom1;
        int tmp2 = denom_A/denom2;
        numer1 = tmp1 * numer1; 
        numer2 = tmp2 * numer2;
        
        int answerNumer = numer1 + numer2;
        Solution T = new Solution();
        int gcd = T.compute(answerNumer, denom_A);
        answer[0] = answerNumer/gcd;
        answer[1] = denom_A/gcd;
        
        return answer;
    }
}