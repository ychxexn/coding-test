import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int X, int[] A) {
        Set leafSet = new HashSet();

        for(int i=0; i<A.length; i++){
            leafSet.add(A[i]);

            if(leafSet.size() == X){
                return i;
            }
        }

        return -1;
    }
}
