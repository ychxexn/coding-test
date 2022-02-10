class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        List<String> item = null;
        String target = null;
        
        for(int i=0; i<items.size(); i++){
            item = items.get(i);
            
            switch(ruleKey){
                case "type" :
                    target = item.get(0);
                    break;
                case "color" :
                    target = item.get(1);
                    break;
                case "name" :
                    target = item.get(2);
                    break;
            }
            
            if(target.equals(ruleValue)){
                result++;
            }
        }
        
        return result;
    }
}