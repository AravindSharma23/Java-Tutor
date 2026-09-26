// Leetcode - Medium -  1541. Minimum Insertions to Balance a Parentheses String

class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(c == '('){
                stack.push('(');
            }else{
                if(i+1<s.length() && s.charAt(i+1)== ')'){
                    i++;
                }else{
                    count++;
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    count++;
                }
            }
        }
        return count+=2*stack.size();
    }
}

// more optimized solution :

class Solution {
    public int minInsertions(String s) {
        int openBracket = 0,closeBracket = 0;

        for(int i = 0;i<s.length();i++){
           char c = s.charAt(i);
           if(c == '('){
            openBracket++;
           }else{
            if(i+1 < s.length() && s.charAt(i+1)== ')'){
                i++;
            }else{
                closeBracket++;
            }
            if(openBracket > 0){
               openBracket--;
            }else{
                closeBracket++;
            }
           }
        }
                   return closeBracket+(openBracket*2);

    }
}
