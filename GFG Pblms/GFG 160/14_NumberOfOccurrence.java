// Searching /  Day - 28 -> Number of occurrence - Easy 


class Solution {
    int countFreq(int[] arr, int target) {
        // code here
       int first = search(arr,target,true);
       int last = search(arr,target,false);
       int count;
       if(first == -1 || last == -1){
           count = 0;
       }else{
           count = (last-first)+1;
       }
       return count;
        
    }
    public static int search(int[] arr,int target,boolean isFirst){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(arr[mid] >target){
                end = mid-1;
            }else if(arr[mid]< target){
                start = mid+1;
            }else{
                res = mid;
                if(isFirst){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
            return res;

    }
}
