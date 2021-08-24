import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(String.valueOf(arr));
        sb.reverse();
        answer = sb.toString();
        
        return answer;
    }
}
