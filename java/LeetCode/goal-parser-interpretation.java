class Solution {
    public String interpret(String command) {
        StringBuffer result = new StringBuffer();
        
        for(int i=0; i<command.length(); i++){
            char now = command.charAt(i);
            if(now == '('){
                char next = command.charAt(i+1);
                if(next == 'a'){
                    result.append("al");
                    i+=3;   // al)
                }else if(next == ')'){
                    result.append("o");
                    i++;    // )
                }
            }else{
                result.append(now);
            }
        }
        
        return result.toString();
    }
}