class Solution {
    public int solution(int[] numbers) {
        int answer = 45;    // 0~9까지 합계
        
        for(int num : numbers){
            answer -= num;
        }
        
        return answer;
    }
}
