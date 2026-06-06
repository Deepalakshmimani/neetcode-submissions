class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack=new ArrayDeque<>();

        if(s.length()<2) return false;

        for(char p:s.toCharArray())
        {
            if(p=='}' &&!stack.isEmpty())
            {
                if(!(p=='}' && stack.pop()=='{'))
                {
                    return false;
                }
                    
            }
            else if(p==')'&&!stack.isEmpty())
            {
                if(!(p==')' && stack.pop()=='('))
                {
                    return false;
                }
            }
            else if (p==']'&&!stack.isEmpty())
            {   
                if(!(p==']' && stack.pop()=='['))
                {
                    return false;
                }
            }
            else
            {
                stack.push(p);
            }
        }

        return stack.isEmpty();
    }
}
