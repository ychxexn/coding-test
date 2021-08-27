class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        int[] dolls = new int[moves.length];
        int pos = 0;
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1] > 0){
                    if(pos > 0 && dolls[pos-1] == board[j][moves[i]-1]){
                        dolls[pos-1] = 0;
                        pos--;
                        answer+=2;
                    }else{
                        dolls[pos++] = board[j][moves[i]-1];
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}
