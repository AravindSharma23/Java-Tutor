 // leetcode -> 88 - Merge Sorted Array -  easy  

// Brute force approach :

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int i = 0, left = 0,right = 0;
        
        while(left<m && right <n){
            if(nums1[left] < nums2[right]){
                temp[i] = nums1[left];
                left++;
                i++;
            }else{
                temp[i] = nums2[right];
                right++;
                i++;
            }
        }
        while(left < m){
            temp[i] = nums1[left];
            left++;
            i++;
        }
        while(right < n){
            temp[i] = nums2[right];
            right++;
            i++;
        }
        for(int j = 0;j<n+m;j++){
            nums1[j] = temp[j];
        }
       System.out.println(nums1);
    }
}

// optimal 1 :

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
// optimal 2:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {0,2,6,8,9};
		int n = 4 , m = 5;
		int len = n+m;
		int gap = len/2 + len%2;
		
		while(gap > 0){
		    int left = 0;
		    int right = gap+left;
		    while(right < len){
		        
		        if(left<n && right >=n){ // arr1 & arr2 // bcz right having gap+left arr len(n) so 
		            swapIfGreater(arr1,arr2,left,right-n); // need to get 'right' original index by -n
		        }else if(left>=n){ // arr2 & arr2
		            swapIfGreater(arr2,arr2,left-n,right-n);// as same above to get original ind of left  & right so -n
		        }else{ // arr 1 & arr1
		            swapIfGreater(arr1,arr1,left,right); 
		        }
		        left++;
		        right++;
		    }
		    if(gap==1) break;
		    gap = gap /2 + gap%2;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
	static void swapIfGreater(int[] arr1, int[] arr2,int idx1,int idx2){
	    if(arr1[idx1] > arr2[idx2]){
	        int temp = arr1[idx1];
	        arr1[idx1] = arr2[idx2];
	        arr2[idx2] = temp;
	        
	        
	    }
	}
}
