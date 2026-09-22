// Problem - 88 - > Easy - > Merge sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int idx = 0;
	   for(int i=m;i<m+n;i++){
	      
	           nums1[i] = nums2[idx];
	           idx++;
	      
	   }
	   Arrays.sort(nums1);
	   System.out.println(Arrays.toString(nums1));
    }
}

//optimized solution 1 :
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int[] temp = new int[m+n];
    //     int i = 0, left = 0,right = 0;
        
    //     while(left<m && right <n){
    //         if(nums1[left] < nums2[right]){
    //             temp[i] = nums1[left];
    //             left++;
    //             i++;
    //         }else{
    //             temp[i] = nums2[right];
    //             right++;
    //             i++;
    //         }
    //     }
    //     while(left < m){
    //         temp[i] = nums1[left];
    //         left++;
    //         i++;
    //     }
    //     while(right < n){
    //         temp[i] = nums2[right];
    //         right++;
    //         i++;
    //     }
    //     for(int j = 0;j<n+m;j++){
    //         nums1[j] = temp[j];
    //     }
    //    System.out.println(nums1);
    int left = m-1,right = 0;

    while(left>=0 && right < n){
        if(nums1[left]> nums2[right]){
            swap(nums1,nums2,left,right);
            left--;
            right++;
        }else{
            break;
        }
    }
    Arrays.sort(nums1,0,m);
    Arrays.sort(nums2);
    for(int i = 0;i < n;i++){
       nums1[m+i] = nums2[i];
    }

    }
        static void swap(int[] nums1 , int[] nums2,int left,int right){
        int temp = nums1[left];
        nums1[left] = nums2[right];
        nums2[right] = temp;
    }
}
