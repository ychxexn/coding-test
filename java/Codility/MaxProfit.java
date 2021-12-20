class Solution {
    public int solution(int[] A) {
        int min = A[0];
        int maxProfit = 0;

        for(int i=1; i<A.length; i++){
            int profit = A[i] - min;
            min = (A[i] < min) ? A[i] : min;

            maxProfit = (maxProfit > profit) ? maxProfit : profit;
        }

        maxProfit = (maxProfit > 0) ? maxProfit : 0;

        return maxProfit;
    }
}
