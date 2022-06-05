import java.util.Stack;
class Solution {
    public String solution(String p) {
        // 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
        if(p == null || p.isEmpty()){
            return new String();
        }
    
        if(isCorrectString(p)){
            return p;
        }
        
        String answer = "";
        String u = null;
        String v = null;
        
        // 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.
        for(int i=1; i<=p.length(); i++){
            u = p.substring(0, i);
            v = p.substring(i);
            if(isBalancedString(u) && isBalancedString(v)){
                break;
            }
        }
        
        // 3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
        if(isCorrectString(u)){
            answer = u + solution(v);
        }else{
            // 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
            // 4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
            answer = "(";
            // 4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다. 
            answer += solution(v);
            // 4-3. ')'를 다시 붙입니다. 
            answer += ")";
            // 4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다. 
            if(u.length() > 2){
                String temp = u.substring(1, u.length()-1);
                for(int i=0; i<temp.length(); i++){
                    char c = temp.charAt(i);
                    answer += (c == '(') ? ')' : '(';
                }
            }
        }
        
        return answer;
    }
    
    // 균형잡힌 괄호 문자열 판단 method
    private boolean isBalancedString(String s){
        return (s.replaceAll("\\(", "").length() == s.replaceAll("\\)", "").length());
    }
    
    // 올바른 괄호 문자열 판단 method
    private boolean isCorrectString(String s){
        boolean result = true;
        Stack<Character> stack = new Stack<Character>();
        
        if(s == null){
            return true;
        }
        for(char c : s.toCharArray()){
            if(stack.isEmpty() && c == ')'){
                result = false;
                break;
            }else{
                if(c == ')'){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        
        if(!stack.isEmpty()){
            result = false;
        }
        
        return result;
    }
}
