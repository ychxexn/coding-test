class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        
        List list = new ArrayList();
        
        for(int i=0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            result[i] = (int)list.get(i);
        }
        
        return result;
    }
}