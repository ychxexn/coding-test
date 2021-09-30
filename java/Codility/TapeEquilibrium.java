class Solution {
    public int solution(int[] A) {
        int sum = 0;
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++){
            sum += A[i];
        }

        for(int i=0; i<A.length; i++){
            left += A[i];
            right = sum - left;

            min =  (min < Math.abs(left-right)) ? min : Math.abs(left-right);
        }

        return min;
    }
}
