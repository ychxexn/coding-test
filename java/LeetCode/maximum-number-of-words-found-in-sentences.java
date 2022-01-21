class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        
        for(String s : sentences){
            int sLength = s.split(" ").length;
            result = (result > sLength) ? result : sLength;
        }
        
        return result;
    }
}