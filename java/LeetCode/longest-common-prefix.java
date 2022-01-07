class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        String str = strs[0];
        
        for(int i=0; i<str.length(); i++){
            int count = 1;
            for(int j=1; j<strs.length; j++){
                try{
                    if(str.charAt(i) == strs[j].charAt(i)){
                        count++;
                    }else{
                        break;
                    }   
                }catch(StringIndexOutOfBoundsException e){
                    break;
                }
            }
            if(count == strs.length){
                answer += str.charAt(i);
            }else{
                break;
            }
        }
        
        return answer;
    }
}