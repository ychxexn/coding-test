import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] answer = new int[N];
        int max = 0;

        for(int i=0; i<A.length; i++){
            if(1 <= A[i] && A[i] <= N){
                answer[A[i]-1]++;
                max = (max > answer[A[i]-1]) ? max : answer[A[i]-1];
            }else if(A[i] == N+1){
                Arrays.fill(answer, max);
            }
        }

        return answer;
    }
