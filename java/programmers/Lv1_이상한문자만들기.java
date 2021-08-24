class Solution {
    public String solution(String s) {
        String answer = "";
        int flag = 1;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            answer += (flag == 1) ? Character.toUpperCase(c) : Character.toLowerCase(c);
            flag *= -1;
            
            if(c == ' '){
                flag = 1;
            }
        }
        
        return answer;
    }
}
