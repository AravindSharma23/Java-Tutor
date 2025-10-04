// 17 . Letter Combinations of a Phone Number - leetcode - medium - FAANG


import java.util.*;
class Solution {
    public List<String> letterCombinations(String digits) {
         if(digits.length() == 0){
            ArrayList<String> ans = new ArrayList<>();
            return  ans;
         }
        
        String[] word = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String>list=new ArrayList<>();
        getword("",digits,0,word,list);
        return list;
    }
    public static void getword(String p,String up, int index,String[] word,ArrayList<String> list){
        if(index==up.length()){
            list.add(p);
            return;
        }
        int num=up.charAt(index)-'0';
        String w=word[num];
        for(int i=0;i<w.length();i++){
            getword(p+w.charAt(i),up,index+1,word,list);
        }
    }
}
