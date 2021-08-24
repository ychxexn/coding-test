import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int count = commands[i][2] - 1;
            
            int[] newArray = new int[end-start+1];
            int num = 0;
            for(int j=start; j<=end; j++){
                newArray[num++] = array[j];
            }
            
            Arrays.sort(newArray);
            answer[i] = newArray[count];
        }
        
        return answer;
    }
}
