import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> chMap = new HashMap();
        Map<String, Character> strMap = new HashMap();
        
        String[] strArr = s.split(" ");
        
        if(strArr.length != pattern.length()){
            return false;
        }
        
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String str = strArr[i];
            
            if(chMap.get(c) == null){
                if(strMap.containsKey(str)){
                    return false;
                }else{
                    chMap.put(c, str);
                    strMap.put(str, c);
                }
            }else{
                if(!chMap.get(c).equals(str)){
                    return false;
                }
            }
        }
        
        return true;
    }
}