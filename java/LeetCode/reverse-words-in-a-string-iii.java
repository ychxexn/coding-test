class Solution {
    public String reverseWords(String s) {
        StringBuffer result = new StringBuffer();
        
        for(String str : s.split(" ")){
            result.append(new StringBuffer(str + " ").reverse());
        }
        
        return result.toString().substring(1);
    }
}