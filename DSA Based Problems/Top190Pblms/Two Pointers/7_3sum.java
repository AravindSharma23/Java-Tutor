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
