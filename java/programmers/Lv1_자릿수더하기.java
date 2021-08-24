public class Solution {
    public int solution(int n) {
        int answer = 0;

        String str = Integer.toString(n);
        
        for(int i=0; i<str.length(); i++){
            answer += str.charAt(i) - '0';  // ASCII 0을 빼면서 char to int 구현
        }

        return answer;
    }
}
