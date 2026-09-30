//leetcode - 32. Longest Valid Parentheses - Hard - Imp

class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Integer> stack = new Stack<>();
        int maxLength = 0;
         stack.push(-1);
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(i);
            }else{
                stack.pop(); // if any close bracket comes means pop existing opn bracket index
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    // curr valid substring length = curr closing bracket index  - index immediately before the valid substring (bracket index that is found before open bracket)
                    int currentLength = i - stack.peek();
                    maxLength = Math.max(maxLength,currentLength);
                }
            }
        }
        return maxLength;

    }
}
