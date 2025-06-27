// Searching - Day - 30 -> Search in Rotated Sorted Array - Medium


// User function Template for Java

class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int i= 0;
        if(arr[0]>arr[arr.length-1]){
            while(true){
                if(arr[i]<arr[i+1]){
                    i++;
                    
                }else{
                  int secondPart = binarySearch(arr,i+1,arr.length-1,key);
                  if(secondPart != -1){
                      return secondPart;
                  }
                //   if(secondPart == -1){
                    return binarySearch(arr,0,i,key);
                  //}
                  //break;
               }
            }
        }
         
         return binarySearch(arr,0,arr.length-1,key);
        
        
       
    }
     static int binarySearch(int[] arr,int start,int end , int key){
        // int start = 0;
        // int end = arr.length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            // if(start == end && arr.length == 1){
            //     return start;
            // }
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
            
        }
          return -1;
    }
}
