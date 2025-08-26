//151 -  Reverse Words in a String -> leetcode - medium

class Solution {
    public String reverseWords(String s) {
        String reversed = "";
        String word = "";
        int count = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                count++;
               
            }else{
                if(count>0){
               word = s.substring(i+1,i+count+1);
               if(reversed.length() == 0){
                   reversed = reversed + word;
               }else{
                    reversed = reversed+" "+ word;

               }
               count = 0;
               word = ""; 
            }
            }
            
        }
        if(count > 0){
                word = s.substring(0,count);
                if(reversed.length() == 0){
                   reversed = reversed + word;
               }else{
                    reversed = reversed+" "+ word;

               }
               
            }
        return reversed;
    }
}
