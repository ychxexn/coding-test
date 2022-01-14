import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set numSet = new HashSet();
        
        for(int num : nums){
            if(numSet.contains(num)){
                return true;
            }
            numSet.add(num);
        }
        
        return false;
    }
}