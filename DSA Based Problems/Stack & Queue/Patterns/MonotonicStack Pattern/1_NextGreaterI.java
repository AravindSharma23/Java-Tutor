// leetcode - 496. Next Greater Element I - easy

// elaborative version
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len2 = nums2.length;
        Stack<Integer> stack = new Stack<>();
        int[] greaterElements = new int[len2];
        HashMap<Integer,Integer> map = new HashMap<>(); // using hashmap bcz we need to store ele with idx
        for(int i= 0;i<len2;i++){
            map.put(nums2[i],i);
        }
        for(int j = len2-1;j>=0;j--){
            int curr = nums2[j];
            if(stack.isEmpty()){
                stack.push(curr);
                greaterElements[j] = -1;
                continue;
            }
            if( !stack.isEmpty() && curr <  stack.peek()){
                greaterElements[j] = stack.peek();
                stack.push(curr);
                continue;
            }
            while( !stack.isEmpty() && stack.peek() <= curr){
                    stack.pop();
            }
            if(stack.isEmpty()){
                greaterElements[j] = -1;
            }else{
               greaterElements[j] = stack.peek();
            }
            stack.push(curr);
        }
       // int[] res = new int[nums1.length]; // creating result arr by checking in hashmap
        for(int k = 0;k<nums1.length;k++){
            if(map.containsKey(nums1[k])){
                nums1[k]= greaterElements[map.get(nums1[k])];
            }
        }
        return nums1;
    }
}

// simplified version 
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len2 = nums2.length;
        Stack<Integer> stack = new Stack<>();
        
        HashMap<Integer,Integer> map = new HashMap<>(); // using hashmap bcz we need to store ele with idx
        for(int i= 0;i<len2;i++){
            map.put(nums2[i],i);
        }
        for(int j = len2-1;j>=0;j--){
            int curr = nums2[j];
            while( !stack.isEmpty() && stack.peek() <= curr){
                    stack.pop();
            }    
            nums2[j] = stack.isEmpty()?-1:stack.peek();
            stack.push(curr);
        }
       
        for(int k = 0;k<nums1.length;k++){
                nums1[k]= nums2[map.get(nums1[k])];
        }
        return nums1;
    }
}
