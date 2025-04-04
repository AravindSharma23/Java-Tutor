// Next Permutation - Medium -> Asked in - Infosys , Flipkart , Amazon , Microsoft , FactSetHike , MakeMyTrip , Google , Qualcomm , Salesforce
/* 
Refer gfg article
step 1 - find pivot 
step2 - If pivot is -1 means then reverse the arr.
step3 - swap arr from end before pivot element.
step4 - finally reverse it to get result arr


*/
class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int pivot = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(arr,0,n-1);
            return;
        }
        for(int i=n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                swap(arr,xpivot,i);
                break;
            }
        }
        reverse(arr,pivot+1,n-1);
    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr,start++,end--);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
