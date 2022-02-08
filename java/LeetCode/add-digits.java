class Solution {
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        
        String str = Integer.toString(num);
        int answer = 0;
        
        for(int i=0; i<str.length(); i++){
            answer += str.charAt(i) - '0';
        }
        
        return addDigits(answer);
    }
}