import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int[] progresses, int[] speeds) {
        List answer = new ArrayList();
        
        int idx = 0;
        int count = 0;
        while(true){
            count = 0;
            for(int i=idx; i<progresses.length; i++){
                progresses[i] += speeds[i];
                if(progresses[i] >= 100 && idx == i){
                    idx++;
                    count++;
                }
            }
            if(count > 0){
                answer.add(count);
            }
            if(idx == progresses.length){
                break;
            }
        }
        
        return answer;
    }
}
