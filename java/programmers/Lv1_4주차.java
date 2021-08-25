class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        String maxLang = null;
        int maxScore = 0;
        
        for(int i=0; i<table.length; i++){
            String[] tableArr = table[i].split(" ");
            int score = 0;
            for(int j=1; j<tableArr.length; j++){
                for(int k=0; k<languages.length; k++){
                    //tableArr[0] 에 대한 점수 == 6-j * preference
                    if(languages[k].equals(tableArr[j])){
                        score += (6-j) * preference[k];
                        break;
                    }
                }
            }
            if(score > maxScore){
                maxLang = tableArr[0];
                maxScore = score;
            }else if(score == maxScore){
                maxLang = (maxLang.compareTo(tableArr[0]) > 0) ? tableArr[0] : maxLang;
            }
        }
        
        return maxLang;
    }
}
