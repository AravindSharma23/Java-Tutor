// 844. Backspace String Compare - leetcode - medium

class Solution {
    public boolean backspaceCompare(String s, String t) {
        // using stack
        // Stack<Character> stack1 = new Stack<>();
        // Stack<Character> stack2 = new Stack<>();
        // int len1 = s.length(), len2 = t.length();

        // for(int i = 0;i<len1;i++){
        //     char curr = s.charAt(i);
        //     if(!stack1.isEmpty() && !(curr >= 97 && curr <= 122)){
        //            stack1.pop();
        //     }else if((curr >= 97 && curr <= 122)){
        //          stack1.push(curr);
        //     }
        // }
        // for(int i = 0;i<len2;i++){
        //     char curr = t.charAt(i);
        //     if(!stack2.isEmpty() && !(curr >= 97 && curr <= 122)){
        //            stack2.pop();
        //     }else if((curr >= 97 && curr <= 122)){
        //          stack2.push(curr);
        //     }
        // }
        // return stack1.equals(stack2);

        // Right solution based on constraints
        return getString(s).equals(getString(t));
       
    } 
    private String getString(String s){
        int n = s.length();
        int hashCount = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = n-1;i>=0;i--){
            char c = s.charAt(i);
            if(c == '#'){
               hashCount++;
               continue;
            }
            if(hashCount>0){ // if hash count >0 means don't insert into sb and its like to avoid the chars
                hashCount--;
            }else{
                sb.insert(0,c); // adding at 0th idx 
            }
        }
        return sb.toString();// convert str builder into string
    }
}
