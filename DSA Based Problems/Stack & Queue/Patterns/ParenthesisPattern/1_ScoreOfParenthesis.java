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

// 
