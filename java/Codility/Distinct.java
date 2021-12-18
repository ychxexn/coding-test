import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] A) {
        Set numSet = new HashSet();

        for(int num : A){
            numSet.add(num);
        }

        return numSet.size();
    }
}
