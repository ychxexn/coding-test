import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> reportMap = new HashMap<String, Set<String>>();
        
        for(String r : report){
            String sender = r.split(" ")[0];
            String recipient = r.split(" ")[1];
            Set<String> record = null;
            
            if(reportMap.containsKey(recipient)){
                record = reportMap.get(recipient);
            }else{
                record = new HashSet<String>();
            }
            
            record.add(sender);
            reportMap.put(recipient, record);
        }
        
        for(String key : reportMap.keySet()){
            Set<String> reporterList = reportMap.get(key);
            if(reporterList.size() >= k){
                for(String reporter : reporterList){
                    for(int i=0; i<id_list.length; i++){
                        if(reporter.equals(id_list[i])){
                            answer[i]++;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}
