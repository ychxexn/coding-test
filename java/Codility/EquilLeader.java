import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int leader = getEquilLeader(A);
        int count = 0;

        for(int i=0; i<A.length; i++){
            int[] arr1 = Arrays.copyOfRange(A, 0, i);
            int[] arr2 = Arrays.copyOfRange(A, i, A.length);

            if(checkEquilLeader(arr1, leader) && checkEquilLeader(arr2, leader)){
                count++;
            }
        }

        return count;
    }

    public int getEquilLeader(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] == num){
                    count++;
                }
                if(count > arr.length/2){
                    return num;
                }
            }
        }
        return -1;
    }

    public boolean checkEquilLeader(int[] arr, int leader){
        int count = 0;

        for(int num : arr){
            if(num == leader){
                count++;
            }
            if(count > arr.length/2){
                return true;
            }
        }
        return false;
    }
}
