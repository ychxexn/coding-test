import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> s = new HashSet<Integer>();
        
        for(int num : nums){
            s.add(num);
        }
    
        answer = (s.size() > nums.length/2) ? nums.length/2 : s.size();
        
        return answer;
    }
}
