import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] strArr = Long.toString(n).split("");
        
        Arrays.sort(strArr);
        
        for(int i=0; i<strArr.length; i++){
            answer += Integer.parseInt(strArr[i]) * Math.pow(10, i);
        }
        
        return answer;
    }
}
