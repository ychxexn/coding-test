class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        if(n > m){
            int temp = m;
            m = n;
            n = temp;
        }
        
        for(int i=n; i>=1; i--){
            if(n % i == 0 && m % i == 0){
                answer[0] = i;
                break;
            }
        }
        
        for(int i=m; ; i++){
            if(i % n == 0 && i % m == 0){
                answer[1] = i;
                break;
            }
        }
        
        return answer;
    }
}
