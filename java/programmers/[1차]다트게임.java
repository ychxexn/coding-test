class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        int score = 0;
        int now = 0;
        int prev = 0;
        char c = 0;
        for(int i=0; i<dartResult.length(); i++){
            c = dartResult.charAt(i);
            if(0 <=  c - '0' && c - '0' <= 9){
                // 숫자
                prev = now;
                now = 0;
                answer += prev;
                score = c - '0';
                
                if('1' == c && '0' == dartResult.charAt(i+1)){  // 10일 경우 예외처리
                    score = 10;
                    i++;
                }
            }else{
                switch(c){
                    case 'S':
                        now += Math.pow(score, 1);
                        break;
                    case 'D':
                        now += Math.pow(score, 2);
                        break;
                    case 'T':
                        now += Math.pow(score, 3);
                        break;
                    case '*':
                        now *= 2;
                        answer += prev;
                        break;
                    case '#':
                        now *= -1;
                        break;
                }
            }
        }
        
        // 마지막 연산 값 더하기
        answer += now;
        
        return answer;
    }
}
