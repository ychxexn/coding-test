import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = null;
        
        String strNumbers = Arrays.toString(numbers);
        strNumbers = strNumbers.substring(1, strNumbers.length()-1).replaceAll(", ", "").trim();
        
        char[] chArrNumbers = strNumbers.toCharArray();
        Arrays.sort(chArrNumbers);
        
        answer = new StringBuilder(new String(chArrNumbers));
        
        return answer.reverse().toString();
    }
}