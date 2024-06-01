// Problem -> 1 -> Two sum - Easy 

/*
// Method-1 --> Bruteforce Technique
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    int[] arr = {2,7,11,15};
    int target = 9;
    
    System.out.print("Res "+Arrays.toString(twoSum(arr,target)));
    
    
    
	}
	static int[] twoSum(int[] arr,int target){
	    for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j] == target){
                return new int[] {i,j};
            }
        }
    }
    return new int[] {-1,-1};
	}
}
*/


// Method 2 - Hash Map
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       
     HashMap<Integer,Integer> map= new HashMap<>();
    
    for(int i=0;i<nums.length;i++){
        int complement = target-nums[i];
        
        if(map.containsKey(complement)){
            return new int[] {map.get(complement),i};
        }
        map.put(nums[i],i);
    }
    return new int[] {-1,-1};
} 
    }
    
   

