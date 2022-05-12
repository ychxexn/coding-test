class Solution {
    public int maximum69Number (int num) {
        String strNum = Integer.toString(num);
        
        return Integer.parseInt(strNum.replaceFirst("6", "9"));
    }
}
