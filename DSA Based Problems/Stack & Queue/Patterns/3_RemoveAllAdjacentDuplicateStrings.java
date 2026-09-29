//leetocde  1047. Remove All Adjacent Duplicates In String - easy

class Solution {  // TC -34ms
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            Character c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
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

// more optimized  TC - 5ms

class Solution {
    public String removeDuplicates(String s) {
        char[] resultArr = new char[s.length()];
        char[] input = s.toCharArray();
        int k = 0;
        for(int i=0;i<s.length();i++){
            if(k == 0){ // adding 1st ele to result arr
                resultArr[k] = input[i];
                k++;
            }else{ // to check with previous whether duplicates are present or not
                if(resultArr[k-1] == input[i]){ //if duplicate present means reduce k
                    k--;
                }else{ // if no duplicate means add it into result arr
                    resultArr[k] = input[i];
                    k++;
                }
            }
        }
        return new String(resultArr,0,k); // finally converting arr into string 
    }
}
