// Majority Element II -> MEDIUM / leetcode  229 - > FAANG 

/*
According to  Boyer-Moore’s Voting Algorithm
n/2 -> o/p will be 1 element
n/3 -> o/p will be 2 elements
n/4 -> o/p will be 3 elements

*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Integer num1 = null,num2 = null;
		int count1 = 0,count2 = 0;
		
		int[] nums = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
		                   
		for(int n : nums){ //To get majority of 2 elements in 1st for each

		    if(num1 != null && num1 == n){
		        count1 ++;
		    }else if(num2 != null && num2 == n){
		        count2 ++;
		    }else if(count1 == 0){
		        num1 = n;
		        count1++;
		    }else if(count2 == 0){
		        num2 = n;
		        count2++;
		    }else{
		        count1--;
		        count2--;
		    }
		    
		}
		System.out.println("counts before "+count1+" "+count2);
		List<Integer> res = new ArrayList<>();
		count1 = 0;
		count2 = 0;
		for(int n : nums){ // To get frequency of num1 and num2 in 2nd for Each
		   
		    if(num1 != null && num1 == n){
		        count1 ++;
		        
		    }
		    if(num2 != null && num2 == n){
		        count2 ++;
		    }
		}
		
		if(count1 > nums.length/3){
		    res.add(num1);
		}
		if(count2 > nums.length/3){
		    res.add(num2);
		}
		Collections.sort(res);
		System.out.println(res);
	}
}
