// 1544 - leetcode - Make the string great - easy 

class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            char curr = s.charAt(i);
            // if(!stack.isEmpty() && (curr >=65 && curr <=90) && (curr+32 == stack.peek())){
            //     stack.pop();
            // }else if(!stack.isEmpty() && (curr >=97 && curr <=122) && (curr-32 == stack.peek())){
            //     stack.pop();
            // }
            if(!stack.isEmpty() && Math.abs(stack.peek()-curr) == 32){ // above code is simplified here
                stack.pop();
            }
            else{
                stack.push(curr);
            }
        }
        StringBuilder sb = new StringBuilder();
        int size = stack.size();
        for(int i = 0;i<size;i++){
            sb.append(stack.pop());
        }
         sb.reverse();
         return sb.toString();

    }
}
