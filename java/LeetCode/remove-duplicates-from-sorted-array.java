import java.util.List;
import java.util.ArrayList;

class Solution {
    public int removeDuplicates(int[] nums) {
        int answer = 1;
        
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                nums[answer++] = nums[i+1];
            }
        }
        
        return answer;
    }
}