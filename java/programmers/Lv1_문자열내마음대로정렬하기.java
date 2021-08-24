import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> strList = new ArrayList<String>(Arrays.asList(strings));
        
        for(int i=0; i<strList.size(); i++){
            answer[i] = String.valueOf(strList.get(i).charAt(n));
        }
        
        Arrays.sort(answer);
        Collections.sort(strList);
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<strList.size(); j++){
                if(answer[i].equals(String.valueOf(strList.get(j).charAt(n)))){
                    answer[i] = strList.get(j);
                    strList.remove(j);
                    break;
                }
            }
        }
        
        return answer;
    }
}
