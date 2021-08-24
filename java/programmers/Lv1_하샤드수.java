class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int num = 0;
        
        String[] str = Integer.toString(x).split("");
        for(int i=0; i<str.length; i++){
            num += Integer.parseInt(str[i]);
        }
        
        if(x % num == 0){
            answer = true;
        }
        
        return answer;
    }
}
