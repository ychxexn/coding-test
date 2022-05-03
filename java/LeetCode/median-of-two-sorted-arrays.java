class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        
        Arrays.sort(mergedArray);
        
        return getMedian(mergedArray);
    }
    
    public double getMedian(int[] arr){
        if(arr.length == 0){
            return 0;
        }else if(arr.length == 1){
            return arr[0];
        }else if(arr.length % 2 == 0){
            int num1 = arr[arr.length / 2 - 1];
            int num2 = arr[arr.length / 2];
            
            return (double)(num1 + num2) / 2;
        }else{
            return (double)arr[arr.length / 2];
        }
    }
}
