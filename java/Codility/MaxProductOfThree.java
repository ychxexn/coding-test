import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);

        int num1 = A[A.length-1] * A[A.length-2] * A[A.length-3];
        int num2 = A[0] * A[1] * A[A.length-1];
        
        return (num1 > num2) ? num1 : num2;
    }
}
