class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        
        int[] arr = {4, 1, 2};
        
        while(n > 0){
            answer.insert(0, arr[n % 3]);
            n = (n % 3 == 0) ? (int)n/3 - 1 : (int)Math.floor(n/3);
        }
        
        return answer.toString();
    }
}
