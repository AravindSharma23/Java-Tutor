// Find a target is present in a arr or not and find its index 




public class Main
{
	
	public static void main(String[] args) {
	    int[] arr ={1,-1,5,8,11,15};
	    int target = 11;
	    System.out.println(" Target is "+findTarget(arr,target,0));
	    System.out.println("Index of target "+findIndex(arr,target,0));
	   }
    public static boolean findTarget(int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || findTarget(arr,target,index+1);
    }
    public static int findIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }
}
