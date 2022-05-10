class Solution {
    public int mySqrt(int x) {
        int answer = 0;
        
        int odd = 1;
        while(x > 0){
            x -= odd;
            odd += 2;
            answer++;
            if(x < 0){
                answer--;
                break;
            }
        }
        
        return answer;
    }
}
