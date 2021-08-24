class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int matchCnt = 0;
        int zeroCnt = 0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zeroCnt++;
                continue;
            }
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    matchCnt++;
                    break;
                }
            }
        }
        
        answer[0] = getRank(matchCnt+zeroCnt);
        answer[1] = getRank(matchCnt);
        
        return answer;
    }
    
    public int getRank(int num){
        switch(num){
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
