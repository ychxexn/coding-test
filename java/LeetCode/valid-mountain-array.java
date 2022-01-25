import java.util.Arrays;

class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean isIncreasing = true;
        int max = getMaxValue(arr);
        
        if(arr.length < 3){
            return false;
        }
        
        if(max == arr[arr.length-1]){
            return false;
        }
        
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                return false;
            }else if(isIncreasing && arr[i-1] > arr[i]){
                return false;
            }else if(!isIncreasing && arr[i-1] < arr[i]){
                return false;
            }
            
            if(arr[i] == max){
                isIncreasing = false;
            }
        }
        
        return true;
    }
    
    public int getMaxValue(int[] arr){
        int[] copyArr = arr.clone();
        
        Arrays.sort(copyArr);
        
        return copyArr[copyArr.length-1];
    }
}