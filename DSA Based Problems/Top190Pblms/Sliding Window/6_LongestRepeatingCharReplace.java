// 424. Longest Repeating Character Replacement - medium - leetcode

class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxWindow = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        for(int right = 0;right < s.length();right++){
              freq[s.charAt(right)-'A']++;
              maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']); // formula : no of chars to be needs to changed = windowSize - maxFreq
              int windowSize = right-left+1;

              if(windowSize - maxFreq > k){ // need to change only k times if not remove from begining of given str
                freq[s.charAt(left)-'A']--;
                left++;
              }
               windowSize = right-left+1; // again calculating window size because it might be changed
              maxWindow = Math.max(maxWindow,windowSize); // finding maxWindow based on latest window size
        }
        return maxWindow;
    }
}
