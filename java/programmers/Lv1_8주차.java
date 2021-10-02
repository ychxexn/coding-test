class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int widthMax = 0;
        int heightMax = 0;
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                widthMax = (widthMax > sizes[i][0]) ? widthMax : sizes[i][0];
                heightMax = (heightMax > sizes[i][1]) ? heightMax : sizes[i][1];
            }else{
                widthMax = (widthMax > sizes[i][1]) ? widthMax : sizes[i][1];
                heightMax = (heightMax > sizes[i][0]) ? heightMax : sizes[i][0];
            }
        }
        
        answer = widthMax * heightMax;
        
        return answer;
    }
}
