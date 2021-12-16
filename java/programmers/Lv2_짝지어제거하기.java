import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        Stack stack = new Stack();
        for(int i=0; i<s.length(); i++){
            if(!stack.empty()){
                if(stack.peek().equals(s.charAt(i))){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        
        if(stack.empty()){
            return 1;
        }else{
            return 0;
        }
    }
}
