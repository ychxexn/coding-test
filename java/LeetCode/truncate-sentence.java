class Solution {
    public String truncateSentence(String s, int k) {
        int cnt = 0;
        int idx = -1;
        
        if(s.indexOf(" ") == -1 || s.split(" ").length <= k){
            return s;
        }
        
        while(true){
            idx = s.indexOf(" ", idx+1);
            if(++cnt == k){
                return s.substring(0, idx);
            }
        }
    }
}