class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int k = 1;
        
        while(n >= k){
            for(int i=0; i<n-k+1; i++){
                int[] subArr = Arrays.copyOfRange(arr, i, i+k);
                sum += Arrays.stream(subArr).sum();
            }
            k += 2;
        }
        
        return sum;
    }
}