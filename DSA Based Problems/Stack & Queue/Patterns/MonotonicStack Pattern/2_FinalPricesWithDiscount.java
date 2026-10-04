// 1475 - Final Prices with special discount in a shop - leetocde - easy

// Brute force :
class Solution {
    static{
        int[] prices = {1};
        for(int i=0;i<200;i++){
            int[] answer = finalPrices(prices);
        }
    }
    public static int[] finalPrices(int[] prices) {
        int[] answer = prices.clone();

        if(prices.length < 0){
            return answer;
        }

        for(int i=0;i<prices.length;i++){
            
            for(int j=i+1;j<prices.length;j++){
                if(prices[i] >= prices[j]){
                    answer[i] -= prices[j];
                    break;
                }
            }
        }

        return answer;
    }
}

// optimcal solution :

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int size = prices.length;
        int[] res = new int[size];
         stack.push(0); //pushing 1st index bcz we will substract this with ele from prices arr
        for(int i=1;i<size;i++){
          while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
            int idx = stack.pop();
            res[idx] = prices[idx]- prices[i];

          }
          stack.push(i);
        }
        while(!stack.isEmpty()){
            int c = stack.pop();
            res[c] = prices[c];
        }
        return res;
    }
}
