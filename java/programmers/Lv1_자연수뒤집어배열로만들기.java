import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String[] strArr = Long.toString(n).split("");
        answer = new int[strArr.length];
        
        for(int i=strArr.length-1, j=0; i>=0; i--,j++){
            answer[j] = Integer.parseInt(strArr[i]);
        }
        
        return answer;
    }
}
