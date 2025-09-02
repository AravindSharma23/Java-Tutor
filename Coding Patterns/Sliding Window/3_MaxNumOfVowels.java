// 1456. Maximum Number of Vowels in a Substring of Given Length - medium - leetcode

class Solution {
    public int maxVowels(String s, int k) {
        int windowCount = 0;
        int maxCount = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for(int i = 0;i<k;i++){
            if(vowels.contains(s.charAt(i))){
                windowCount++;
            }
        }
        maxCount = windowCount;

        for(int i = k;i<s.length();i++){
          
          if(vowels.contains(s.charAt(i-k))){ //removing prev one from slidingwindow so need to decrement  
            windowCount--;
          }

          if(vowels.contains(s.charAt(i))){ // checking current char 
            windowCount++;
          }
          maxCount = Math.max(maxCount,windowCount);
        }
        return maxCount;
        
    }
}
