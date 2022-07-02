import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;
        
        for(int lotto : lottos){
            if(lotto == 0){
                zeroCount++;
                continue;
            }
            if(IntStream.of(win_nums).anyMatch(x -> x == lotto)){
                count++;
            }
        }
        
        answer[0] = getLottoRank(count + zeroCount);
        answer[1] = getLottoRank(count);
        
        return answer;
    }
    
    private int getLottoRank(int count){
        switch(count){
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