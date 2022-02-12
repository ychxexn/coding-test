class Solution {
    public String sortSentence(String s) {
        String[] strArr = s.split(" ");
        String[] sortArr = new String[strArr.length];
        
        for(String str : strArr){
            int index = str.charAt(str.length()-1) - '0';
            sortArr[index-1] = str.substring(0, str.length()-1);
        }
        
        return String.join(" ", sortArr);
    }
}