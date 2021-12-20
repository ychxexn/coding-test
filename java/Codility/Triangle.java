import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        if(A.length < 3){
            return 0;
        }

        Arrays.sort(A);

        for(int i=0; i<A.length-2; i++){
            long P = A[i];
            long Q = A[i+1];
            long R = A[i+2];

            if(P + Q > R){
                return 1;
            }
        }

        return 0;
    }
}
