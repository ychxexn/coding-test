class Solution {
    public int minimumSum(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        
        Arrays.sort(numArr);
        
        return Integer.parseInt("" + numArr[0] + numArr[2]) + Integer.parseInt("" + numArr[1] + numArr[3]);
    }
}