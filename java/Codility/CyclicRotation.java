class Solution {
    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        int index = 0;
        int cursor = A.length-(K%A.length);

        while(true){
            if(cursor == A.length){
                cursor = 0;
            }
            result[index++] = A[cursor++];
            if(cursor == A.length-(K%A.length)){
                break;
            }
        }

        return result;
    }
}
