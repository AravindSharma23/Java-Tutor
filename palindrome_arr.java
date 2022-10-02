class Main{
    public static void main(String args[]){
        int arr[]={1,2,2,1};
        int tot=0;
        for(int i =0;i<arr.length;i++){
            tot=tot*10+arr[i];
        }
        int temp=tot;
        int sum=0,rem;
        while(temp>0){
            rem = temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        if(sum == tot){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
