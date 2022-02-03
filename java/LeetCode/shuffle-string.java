class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chArr = new char[s.length()];
        
        for(int i=0; i<s.length(); i++){
            chArr[indices[i]] = s.charAt(i);
        }
        
        return String.valueOf(chArr);
    }
}