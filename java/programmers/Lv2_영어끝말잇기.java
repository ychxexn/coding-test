import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List wordList = new ArrayList();
        for(int i=0; i<words.length; i++){
            if(wordList.contains(words[i])){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            if(i!=0){
                char a = words[i-1].charAt(words[i-1].length()-1);
                char b = words[i].charAt(0);
                if(a != b){
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    break;
                }
            }
            wordList.add(words[i]);
        }

        return answer;
    }
}
