import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        int listIdx = -1;
        
        for(int i=0; i<arr.length; i++){
            if(list.size() > 0){
                if(list.get(listIdx) == arr[i]){
                    continue;
                }
            }
            list.add(arr[i]);
            listIdx++;
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
