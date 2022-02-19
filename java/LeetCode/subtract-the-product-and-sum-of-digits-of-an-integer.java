class Solution {
    public int subtractProductAndSum(int n) {
        char[] arrN = Integer.toString(n).toCharArray();
        int product = 1;
        int sum = 0;
        
        for(int i=0; i<arrN.length; i++){
            product *= arrN[i] - '0';
            sum += arrN[i] - '0';
        }
        
        return product - sum;
    }
}