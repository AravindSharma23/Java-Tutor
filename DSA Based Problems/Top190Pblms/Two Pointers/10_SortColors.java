// 75. Sort Colors - leetcode - medium

// normal swapping(sort) is exceeded so refer below

class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0; // for 0
        int mid = 0; // for 1
        int high = n-1; // for 2
        while(mid<=high){
            // Move 0 to the left
            if(arr[mid]== 0){
                if(low != mid){ // to avoid swapping for same index 
                    swap(arr,low,mid);
                }
                // if we found 0 or swapping happened means increment both
                low++;
                mid++;
            }else if(arr[mid] == 1){ // 1 is already in correct section
                mid++;
            }else{ // Move 2 to the right
                swap(arr,mid,high);
                high--; // Don't increment mid here bcz mid is may be on 0 side or 1 side 
            }
        }

    }
    public void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
