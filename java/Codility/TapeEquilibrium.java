class Solution {
    public int solution(int[] A) {
        int answer = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        int right = 0;

        for(int num : A){
            sum += num;
        }

        for(int i=0; i<A.length-1; i++){
            left += A[i];
            right = sum - left;

            answer = (answer < Math.abs(left-right)) ? answer : Math.abs(left-right);
        }


        return answer;
    }
}
