// Leetcode  -  Longest Palindromic Substring - > 5 -> FAANG


// Refer - https://www.youtube.com/watch?v=hi3mq5NzEJY
class Solution {
    public String longestPalindrome(String s) {
          String ans = "";
          for(int i=0;i<s.length();i++){ // single mid 
            if(expand(s,i,i).length() > ans.length()){
                ans = expand(s,i,i);
            }
          }
          
           for(int i=0;i<s.length();i++){ // double mid
            if(expand(s,i,i+1).length() > ans.length()){
                ans = expand(s,i,i+1);
            }
          }
         return ans;
    }
    public static String expand(String A, int L,int R){
         while( L >=0 && R < A.length() && A.charAt(L) == A.charAt(R) ){
            L--;
            R++;
         }
         return A.substring(L+1,R);
    }
  
}
