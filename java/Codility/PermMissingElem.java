import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        if(A.length == 0){
            return 1;
        }else{
            int num = 1;

            Arrays.sort(A);
            for(int i=0; i<A.length; i++, num++){
                if(A[i] != num){
                    return num;
                }
            }
            return A[A.length-1]+1;   
        }
    }
}
