class Solution {
    public int solution(String s) {
        int answer = 0;
        int num = 0;
 
        if(s.indexOf("+") > 0 || s.indexOf("-") > 0){
            answer = Integer.parseInt(s.substring(0, s.indexOf("+"))) + Integer.parseInt(s.substring(s.indexOf("+")+1));    
        }else{
            answer = Integer.parseInt(s);
        }
        
        
        return answer;
    }
}
