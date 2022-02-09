class Solution {
    public int balancedStringSplit(String s) {
        int result = 0;
        int lCount = 0;
        int rCount = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                lCount++;
            }else{
                rCount++;
            }
            
            if(lCount == rCount){
                result++;
            }
        }
        
        return result;
    }
}