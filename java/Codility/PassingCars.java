class Solution {
    public int solution(int[] A) {
        int answer = 0;
        int count = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] == 0){
                count++;
            }else{
                answer += count;
            }
            if(answer > 1000000000){
                return -1;
            }
        }

        return answer;
    }
}
