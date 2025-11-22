// Max points obtain from cards - leetcode - 1423 medium 

// Here we used sliding window with two pointers 


class Solution {
    public int maxScore(int[] cards, int k) {
        int tot = 0;
        for(int i = 0;i<k;i++){
            tot+=cards[i];
        }
        int max = tot;
        for(int i = k-1 ,j=cards.length-1;i>=0;i--,j--){
            tot = tot+cards[j]-cards[i];
            max = Math.max(tot,max);
        }
        return max;
    }
}

