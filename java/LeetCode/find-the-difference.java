class Solution {
    public char findTheDifference(String s, String t) {
        int[] chCnt = new int[26];
        
        for(int i=0; i<s.length(); i++){
            chCnt[s.charAt(i) - 'a']++;
            chCnt[t.charAt(i) - 'a']--;
        }
        chCnt[t.charAt(t.length()-1) - 'a']--;
        
        for(int i=0; i<chCnt.length; i++){
            if(chCnt[i] < 0){
                return (char)('a' + i);
            }
        }
        
        return '0';
    }
}