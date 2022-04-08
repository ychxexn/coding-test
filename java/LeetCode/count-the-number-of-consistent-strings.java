class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int answer = words.length;
        
        for(String word : words){
            for(int i=0; i<allowed.length(); i++){
                char c = allowed.charAt(i);
                word = word.replaceAll(""+c, "");
            }
            if(word.length() > 0){
                answer--;
            }
        }
        
        return answer;
    }
}