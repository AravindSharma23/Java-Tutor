//Rotate Array -> Medium - Asked Companies - Amazon , Microsoft , MAQ Software

// Rotate an array by d times 
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
       d%=n;
       reverse(arr,0,d-1);
       reverse(arr,d,n-1);
       reverse(arr,0,n-1);
       //System.out.println()
    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
