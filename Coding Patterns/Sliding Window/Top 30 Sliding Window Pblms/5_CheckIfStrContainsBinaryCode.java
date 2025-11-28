
// 1461. Check If a String Contains All Binary Codes of Size K - Leetcode - medium

class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();

        for(int i = 0;i<=s.length()-k;i++){
            set.add(s.substring(i,i+k));
        }
        return set.size() == Math.pow(2,k); // why 2 means binary having 2 digits
      // eg : 2 ^1 means possible of 2 substrings  like 0,1
      // 2^2 means possible of 4 substrings like 00, 01,10,11
    }
}
