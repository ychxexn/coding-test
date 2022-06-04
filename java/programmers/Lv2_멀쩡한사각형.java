class Solution {
    public long solution(int w, int h) {
        long max = 1;
        
        for(long i=2; i<Math.max(w,h)+1; i++){
            if((w % i == 0) && (h % i == 0)){
                max = i;
            }
        }
        
        return (long)w * h - (w + h - max);
    }
}
