class Solution {
    public int solution(int num1, int num2) {
        double tmp = num1/(double)num2;
        double answer = (tmp) *1000;
        return (int)answer;
    }
}