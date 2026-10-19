class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char sc = s.charAt(i);
            if(sc == '('|| sc == '['|| sc == '{'){
                stack.push(sc);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
            
            
            
            char top = stack.pop();
            if(sc == ')' && top!='(' ||sc == ']' && top!='['|| sc == '}' && top!='{' ){
                return false;
            }
            }
            
            
        }
        return stack.isEmpty();
    }
}