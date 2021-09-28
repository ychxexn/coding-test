class Solution {
    public int solution(int[] A) {
        int answer = 0;
        boolean check = false;

        for(int i=0; i<A.length-1; i++){
            check = false;
            if(A[i] == 0){
                continue;
            }
            for(int j=i+1; j<A.length; j++){
                if(A[i] == A[j]){
                    check = true;
                    A[i] = 0;
                    A[j] = 0;
                }
            }
            if(!check){
                return A[i];
            }
        }

        return answer;
    }
}
