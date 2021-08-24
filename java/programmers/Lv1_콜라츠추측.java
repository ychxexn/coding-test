class Solution {
    public static int answer = 0;
    public int solution(int num) {
        collatz(num);
        return answer;
    }
    
    public void collatz(long num){
        if(num == 1){
            return;
        }
        
        if(answer == 500){
            answer = -1;
            return;
        }
        
        answer++;
        if(num % 2 == 0){
            collatz(num/2);
        }else{
            collatz(num*3+1);
        }
        
    }
}
