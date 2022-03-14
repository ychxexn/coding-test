class Solution {
    public int[] decompressRLElist(int[] nums) {
        int[] answer;
        int count = 0;
        int freq = 0;
        int val = 0;
        int index = 0;
        
        for(int i=0; i<nums.length; i+=2){
            count += nums[i];
        }
        
        answer = new int[count];
        
        for(int i=0; i<nums.length; i+=2){
            freq = nums[i];
            val = nums[i+1];
            
            for(int j=0; j<freq; j++){
                answer[index++] = val;
            }
        }
        
        return answer;
    }
}