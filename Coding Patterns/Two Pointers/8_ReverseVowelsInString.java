
// leetcode  345. Reverse Vowels of a String - Easy

import java.util.*;
class Solution {
    public String reverseVowels(String s) {
       
       int left = 0;
       int right = s.length()-1;
       char[] charArr = s.toCharArray();
       while(left < right){
          while(left < right && !isVowel(charArr[left])){ // avoiding non vowels until get vowels in left side
            left++;
          }  
           while(left < right && !isVowel(charArr[right])){ // avoiding non vowels until get vowels in right side
            right--;
          } 
        // if any char comes out of these above two while loop means these are vowels so swap it 
          if(left<right){
              char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
          }
           
        }
           return new String(charArr);
       }
     

    
    static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}    
