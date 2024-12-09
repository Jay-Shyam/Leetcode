class Solution {
    public boolean isValid(String s) {
       /* int bracket=0;
        int curly=0;
        int square =0;

       for(int i=0; i< s.length();i++){
        switch(s.charAt(i)){
            case'(': bracket++; break;
            case')':  bracket--; break;
            case'{':  curly++ ; break;
            case'}':  curly-- ; break;
            case'[':  square++ ; break;
            case']':  square--; break;
        }
        


       } 
        if(bracket == 0 && curly ==0 && square ==0){ return true;}
        else{return false;} */


        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Check closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false; // No matching opening bracket
                
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false; // Mismatched bracket
                }
            }
        }

        // Valid if stack is empty
        return stack.isEmpty();
    }
}

    
