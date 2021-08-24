import java.util.*;

class Solution {
    public List solution(int[] numbers) {
        
        List<Integer> answer = new ArrayList<Integer>();
        int now = 0;
        
        for(int i=0; i<numbers.length; i++){
            now = i;
            for(int j=0; j<numbers.length; j++){
                if(j == now) continue;
                
                if(!answer.contains(numbers[i] + numbers[j])){
                    answer.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        Collections.sort(answer);
        return answer;
    }
}
