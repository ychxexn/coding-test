import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int num = 1;

        Arrays.sort(A);

        for(int i=0; i<A.length; i++){
            if(num++ != A[i]){
                return 0;
            }
        }

        return 1;
    }
}
