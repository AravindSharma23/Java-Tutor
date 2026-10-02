//leetcode -  856. Score of Parentheses - medium
// without using stack -> TC - 0ms 
class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0,openBracket = 0;
       boolean  seenFirstClosingBracket = false;
        for(char c : s.toCharArray()){
          if(c == ')'){
            if(!seenFirstClosingBracket){
                seenFirstClosingBracket = true;
                score = score +(int) Math.pow(2,openBracket-1);
            }
            openBracket--;
          }else{
            openBracket++;
            seenFirstClosingBracket = false;
          }
        }
       return score; 
    }
}

// using Stack : - TC -> 1ms
class Solution {
    public int scoreOfParentheses(String s) {
        //using stack
        Stack<Integer> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '('){
                stack.push(0);
            }else{
                int value = 0;
                 while(stack.peek() != 0){
                    value = value + stack.pop();
                 }
                 stack.pop();
                 stack.push(value == 0 ? 1 : 2 * value);
            }
        }
        int result = 0;
        while(!stack.isEmpty()){
              result = result +stack.pop();
        }
        return result;
    }
}
