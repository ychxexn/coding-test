class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] arr = new int[m][n];
        List<List<Integer>> answer = new ArrayList();
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int x = (i + ((j + k) / n)) % m;
                int y = (j + k) % n;
                
                arr[x][y] = grid[i][j];
            }
        }
        
        for(int i=0; i<m; i++){
            List<Integer> list = new ArrayList();
            for(int j=0; j<n; j++){
                list.add(arr[i][j]);
            }
            answer.add(list);
        }
        
        return answer;
    }
}