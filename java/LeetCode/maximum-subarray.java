class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        int max = nums[0];
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        
        for(int i=1; i<dp.length; i++){
            dp[i] = Math.max(dp[i-1], 0) + nums[i-1];
            max = Math.max(dp[i], max);
        }
        
        return max;
    }
}