// 4. Median of Two Sorted Arrays - leetcode - HARD

/*
 --1 Merge two arrays and sort them using merge sort
 --2 Find median 
*/


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mix = new int[nums1.length+nums2.length];
        int i = 0,j=0,k=0;
        while(i<nums1.length && j< nums2.length){
            if(nums1[i] < nums2[j]){
                mix[k] = nums1[i];
                i++;
            }else{
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i<nums1.length){
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            mix[k] = nums2[j];
            j++;
            k++;
        }
        if(mix.length%2 == 1){ // merged arr is odd means just divide its len by 2 to get median
            return mix[mix.length/2];
        }else{ // merged arr is even means find mid and before mid element and add them and divide by 2 to get median
            return (mix[mix.length/2 -1 ] + mix[mix.length/2]) /2.0;
        }
    }
}
