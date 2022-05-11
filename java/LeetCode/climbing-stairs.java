class Solution {
    public int climbStairs(int n) {
        int answer = 1;
        
        int prev = 1;
        int prev2 = 1;
        
        for(int i=2; i<=n; i++){
            answer = prev + prev2;
            prev = prev2;
            prev2 = answer;
        }
        
        return answer;
    }
}
