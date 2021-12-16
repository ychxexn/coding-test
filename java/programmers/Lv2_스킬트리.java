class Solution {
    public int solution(String skill, String[] skill_trees) {
        int result = skill_trees.length;
        
        for(String s : skill_trees){
            int index = -1;
            boolean passFlag = false;
            for(int i=0; i<skill.length(); i++){
                if(s.indexOf(skill.charAt(i)) == -1){
                    passFlag = true;
                    continue;
                }
                if(index < s.indexOf(skill.charAt(i)) && !passFlag){
                    index = s.indexOf(skill.charAt(i));
                }else{
                    result--;
                    break;
                }
            }
        }
        
        return result;
    }
}
