class Solution {
    public List<String> cellsInRange(String s) {
        List<String> answer = new ArrayList();
        
        char startCol = s.split(":")[0].charAt(0);
        int startRow = s.split(":")[0].charAt(1) - '0';
        char endCol = s.split(":")[1].charAt(0);
        int endRow = s.split(":")[1].charAt(1) - '0';
        
        for(int i=startCol; i<=endCol; i++){
            for(int j=startRow; j<=endRow; j++){
                answer.add("" + (char)i + j);
            }
        }
        
        return answer;
    }
}