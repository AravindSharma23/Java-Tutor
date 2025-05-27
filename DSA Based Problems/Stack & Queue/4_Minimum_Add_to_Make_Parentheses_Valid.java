// Leetcode  - 921. Minimum Add to Make Parentheses Valid - medium


class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == ')'){ // 1st check for close bracket 
                if(!stack.isEmpty() && stack.peek() == '('){ 
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }else{
                  stack.push(c);

            }
        }
        return stack.size();
    }
}
