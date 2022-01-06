class Solution {
    public boolean isPalindrome(int x) {
        String strX = Integer.toString(x);
        int p = 0;
        int q = strX.length() - 1;
        
        while(p < q){
            if(strX.charAt(p) != strX.charAt(q)){
                return false;
            }
            p++;
            q--;
        }
        
        return true;
    }
}