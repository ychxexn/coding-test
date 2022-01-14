import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int[] answer = null;
        
        int idx = digits.length - 1;
        boolean flag = ++digits[idx--] == 10;
        
        while(flag && idx > 0){
            digits[idx--] = 0;
            flag = ++digits[idx-1] == 10;
        }
        
        if(digits[0] == 10){
            answer = new int[digits.length+1];
            answer[0] = 1;
            answer[1] = 0;
            
            for(int i=1, cursor=2; cursor<answer.length; i++, cursor++){
                answer[cursor] = digits[i];
            }
        }else{
            return digits;
        }
        
        return answer;
    }
}