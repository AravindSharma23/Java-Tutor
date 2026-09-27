// leetcode - 844. Backspace String Compare - easy


class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        int len1 = s.length(), len2 = t.length();

        for(int i = 0;i<len1;i++){
            char curr = s.charAt(i);
            if(!stack1.isEmpty() && !(curr >= 97 && curr <= 122)){
                   stack1.pop();
            }else if((curr >= 97 && curr <= 122)){
                 stack1.push(curr);
            }
        }
        for(int i = 0;i<len2;i++){
            char curr = t.charAt(i);
            if(!stack2.isEmpty() && !(curr >= 97 && curr <= 122)){
                   stack2.pop();
            }else if((curr >= 97 && curr <= 122)){
                 stack2.push(curr);
            }
        }
        return stack1.equals(stack2);
    }
}
