// Segregate 0s and 1s - easy -gfg - PaytmGoldman SachsFab.com

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
            if(arr[left] != 0 && arr[right] != 1 && left < right){
                int temp = arr[left] ;
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            
        }
        
    }
}
