class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] numArr = new int[rows][columns];
        int num = 1;
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                numArr[i][j] = num++;
            }
        }
        
        for(int i=0; i<queries.length; i++){
            int r1 = queries[i][0] - 1;
            int c1 = queries[i][1] - 1;
            int r2 = queries[i][2] - 1;
            int c2 = queries[i][3] - 1;
            
            int temp = numArr[r1][c1];
            int min = temp;
            
            for(int r=r1+1; r<=r2; r++){
                min = Math.min(min, numArr[r][c1]);
                numArr[r-1][c1] = numArr[r][c1];
            }
            for(int c=c1+1; c<=c2; c++){
                min = Math.min(min, numArr[r2][c]);
                numArr[r2][c-1] = numArr[r2][c];
            }
            for(int r=r2-1; r>=r1; r--){
                min = Math.min(min, numArr[r][c2]);
                numArr[r+1][c2] = numArr[r][c2];
            }
            for(int c=c2-1; c>c1; c--){
                min = Math.min(min, numArr[r1][c]);
                numArr[r1][c+1] = numArr[r1][c];
            }
            numArr[r1][c1+1] = temp;
            answer[i] = min;
        }
        return answer;
    }
}