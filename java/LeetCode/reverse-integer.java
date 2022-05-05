class Solution {
    public int reverse(int x) {
        String s = Integer.toString(Math.abs(x));
        int answer = 0;
        
        try{
            answer = Integer.parseInt(new StringBuffer(s).reverse().toString());
        
            if(x < 0){
                answer *= -1;
            }
        }catch(NumberFormatException e){
            return 0;
        }
        
        return answer;
    }
}
