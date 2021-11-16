import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        
        int[] mathArr1 = {1,2,3,4,5};
        int[] mathArr2 = {2,1,2,3,2,4,2,5};
        int[] mathArr3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] matchCnt = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == mathArr1[i % mathArr1.length]){
                matchCnt[0]++;
            }
            if(answers[i] == mathArr2[i % mathArr2.length]){
                matchCnt[1]++;
            }
            if(answers[i] == mathArr3[i % mathArr3.length]){
                matchCnt[2]++;
            }
        }
        
        int maxMatchCnt = Math.max(Math.max(matchCnt[0], matchCnt[1]), matchCnt[2]);
        List<Integer> mvpList = new ArrayList<Integer>();
        for(int i=0; i<matchCnt.length; i++){
            if(maxMatchCnt == matchCnt[i]){
                mvpList.add(i+1);
            }
        }
        
        answer = new int[mvpList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = mvpList.get(i);
        }
        
        return answer;
    }
}
