import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int length = arr.length-1;
        
        if(length == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            int minIndex = getMinIndex(arr);
            answer = new int[arr.length-1];
            
            for(int i=0, j=0; i<arr.length; i++){
                if(i == minIndex){
                    continue;
                }
                answer[j] = arr[i];
                j++;
            }        
        }
        
        return answer;
    }
    
    public int getMinIndex(int[] arr){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        
        return minIndex;
    }
}
