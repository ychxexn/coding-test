class Solution {
    public int findCenter(int[][] edges) {
        int num1 = edges[0][0];
        int num2 = edges[0][1];
        
        for(int i=1; i<edges.length; i++){
            for(int j=0; j<edges[i].length; j++){
                if(num1 == edges[i][j]){
                    return num1;
                }else if(num2 == edges[i][j]){
                    return num2;
                }
            }
        }
        
        return 0;
    }
}