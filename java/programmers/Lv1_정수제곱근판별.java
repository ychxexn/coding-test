class Solution {
    public long solution(long n) {
        long answer = -1;
        
        if((int)Math.sqrt(n) == Math.sqrt(n)){
            answer = (long)Math.pow(Math.sqrt(n) + 1, 2);
        }
        
        return answer;
    }
}
