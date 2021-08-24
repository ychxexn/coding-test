class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = "";
        while(n > 0){
            s = (n % 3) + s;
            n /= 3;
        }
        
        s = new StringBuffer(s).reverse().toString();
        
        answer = Integer.parseInt(s, 3);
        
        return answer;
    }
}
