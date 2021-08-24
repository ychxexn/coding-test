class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c >= 'A' && c <= 'Z'){
                if(c + n >= 'A' && c + n <= 'Z'){
                    answer += Character.toString(c + n);
                }else{
                    answer += Character.toString(c + n - 26);
                }
            }else if(c >= 'a' && c <= 'z'){
                if(c + n >= 'a' && c + n <= 'z'){
                    answer += Character.toString(c + n);
                }else{
                    answer += Character.toString(c + n - 26);
                }
            }else{
                answer += c;
            }
        }
        
        return answer;
    }
}
