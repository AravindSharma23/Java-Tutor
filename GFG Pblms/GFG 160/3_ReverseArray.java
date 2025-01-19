// Reverse an array -Easy- Bloomberg Facebook TCS Adobe Google Infosys Capgemini Morgan Stanley Amazon Microsoft Apple Yahoo PayPal Uber

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int start = 0;
        int end = arr.length-1;
        while(start<end){
           swap(arr,start,end);
           start++;
           end--;
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
