class Solution {
    public boolean find132pattern(int[] nums) {
        int min = nums[0];
        
        for(int j=1; j<nums.length-1; j++){
            for(int k=j+1; k<nums.length; k++){
                if(min < nums[k] && nums[k] < nums[j]){
                    return true;
                }
                min = Math.min(min, nums[j]);
            }
        }
        
        return false;
    }
}
