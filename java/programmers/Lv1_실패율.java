import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageCnt = new int[N];
        Map<Integer, Double> failRate = new HashMap();
        int user = stages.length;
        
        for(int i=0; i<stages.length; i++){
            if(stages[i] == N + 1){
                continue;    // 마지막 스테이지 클리어
            }
            stageCnt[stages[i] - 1]++;
        }
        
        for(int i=0; i<stageCnt.length; i++){
            if(user == 0){
                failRate.put(i, 0d);
                continue;
            }
            failRate.put(i, (double)stageCnt[i] / (double)user);
            user -= stageCnt[i];
        }
        
        for(int i=0; i<N; i++){
            double max = Double.MIN_VALUE;
            int maxKey = 0;
            
            for(int key : failRate.keySet()){
                if(max < failRate.get(key)){
                    max = failRate.get(key);
                    maxKey = key;
                }
            }
            
            answer[i] = maxKey + 1;
            failRate.remove(maxKey);
        }
        
        return answer;
    }
}
