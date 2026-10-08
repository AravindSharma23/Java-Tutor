// Previous Greater Element 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   //Previous Greater Element   
		int[] arr = {4, 5, 2, 10, 8};
		int[] res = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i = 0;i< arr.length;i++){
		    while(!stack.isEmpty() && stack.peek() <= arr[i]){ // as same as next greater element but left to right traversal
		        stack.pop();
		    }
		    res[i] = stack.isEmpty() ? -1 : stack.peek();
		    stack.push(arr[i]);
		}
		System.out.println(Arrays.toString(res));

	}
}
