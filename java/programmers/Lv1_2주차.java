class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        
        // n번 학생이 받은 점수의 합계
        int[] sumArr = new int[scores.length];
        
        for(int i=0; i<scores.length; i++){
            int myScore = scores[i][i]; // n번 학생이 자신을 평가한 점수
            int maxScore = myScore;     // n번 학생을 가장 높게 평가한 점수
            int minScore = myScore;     // n번 학생을 가장 낮게 평가한 점수
            boolean isEqual = false;    // n번 학생과 같은 점수로 평가한 학생이 있는지 체크
            
            for(int j=0; j<scores[i].length; j++){
                sumArr[i] += scores[j][i];
                
                if(maxScore < scores[j][i]){
                    maxScore = scores[j][i];
                }
                if(minScore > scores[j][i]){
                    minScore = scores[j][i];
                }
                if(myScore == scores[j][i] && i != j){
                    isEqual = true;
                }
            }
            
            if(maxScore == myScore || minScore == myScore){     // 내 점수가 제일 높거나 낮으면
                if(isEqual){    // 같은 점수가 있는 경우 그대로
                    answer += getGrade(sumArr[i], scores.length);    
                }else{          // 아니면 내 점수 빼고 계산
                    answer += getGrade(sumArr[i]-myScore, scores.length-1);   
                }
            }else{
                answer += getGrade(sumArr[i], scores.length);
            }
        }
        
        return answer;
    }
    
    public String getGrade(int score, int div){
        float avg = (float)score/div;
        
        switch((int)avg/10){
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}
