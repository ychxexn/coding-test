class Solution {
    public String solution(String s) {
        String answer = "";
        
        int start = 0;
        int end = s.length() - 1;
        
        while(start < end){
            start++;
            end--;
        }
        
        if(start == end){
            answer = "" + s.charAt(start);
        }else{
            answer = "" + s.charAt(end) + s.charAt(start);
        }
        
        return answer;
    }
}
