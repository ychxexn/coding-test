class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.size() == 0){
                    return false;
                }
                if(!isPair(stack.pop(), c)){
                    return false;
                }
            }
        }
        
        if(stack.size() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isPair(char c1, char c2){
        if((c1 == '(' && c2 == ')')
            || (c1 == '[' && c2 == ']')
            || (c1 == '{' && c2 == '}')){
            return true;
        }else{
            return false;
        }
    }
}