// 15. 3Sum - leetcode - medium

//Brute force 1:

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {-1,0,1,2,-1,-4};
	//	List<List<Integer>> res= new ArrayList<>();
	Set<List<Integer>> set = new HashSet<>();
		int n = arr.length;
		for(int i = 0;i<n;i++){
		    for(int j = i+1;j<n;j++){
		        for(int k = j+1;k<n;k++){
		            int sum = arr[i]+arr[j]+arr[k];
		            if(sum == 0){
		               List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
		               Collections.sort(temp); // sort it to know what are duplicates
		               set.add(temp); // remove dups by adding it into set
		                   
		            }
		        }
		    }
		}
		System.out.println(set);

	}
}

// Brute force 2: (optimized little) :
public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {-1,0,1,2,-1,-4};
		List<List<Integer>> res= new ArrayList<>();
	Set<List<Integer>> mainSet = new HashSet<>();
		int n = arr.length;
		for(int i = 0;i<n;i++){
		    Set<Integer> set = new HashSet<>();
		    for(int j = i+1;j<n;j++){
		        int third = -(arr[i]+arr[j]);
		        if(set.contains(third)){
		            List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
		            Collections.sort(temp);
		            mainSet.add(temp);
		           }
		           set.add(arr[j]);
		   }
		}
		  
		  System.out.println(mainSet);

		}

// more optimized : 30ms

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	     int[] nums = {-1, 0, 1, 2, -1, -4};
	     int n = nums.length;
		 List<List<Integer>> ans = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {

            // Skip duplicate value for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {

                    j++;

                } else if (sum > 0) {

                    k--;

                } else {

                    // Found a triplet
                    List<Integer> temp = Arrays.asList(
                        nums[i],
                        nums[j],
                        nums[k]
                    );

                    ans.add(temp);

                    j++;
                    k--;

                    // Skip duplicate values from left
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate values from right
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        System.out.println(ans);

		}

	}



