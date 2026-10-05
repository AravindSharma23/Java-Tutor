// leetcode  901 - Online stock span - Medium

class StockSpanner {
    Stack<Integer> stack;
    ArrayList<Integer> spans; 
    public StockSpanner() {
        stack =  new Stack<>(); // it contains higher values if any smaller means pop it out
        spans = new ArrayList<>();
    }
    
    public int next(int price) {
        spans.add(price); // storing stocks to compare with stack vals
        int i = spans.size()-1;
        while(!stack.isEmpty() && spans.get(stack.peek()) <= price){
            stack.pop();
        }
        int span;
        if(stack.isEmpty()){
            span = i+1;
        }else{
            span = i-stack.peek();
        }
        stack.push(i);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
