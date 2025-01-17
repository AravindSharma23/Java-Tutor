//Move All Zeroes to End - Easy - Paytm ,Amazon ,Microsoft ,Samsung, SAPLabs, Linkedin,Bloomberg


    void pushZerosToEnd(int[] arr) {
        // code here
        int end = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                swap(arr,i,end);
                end++;
            }
        }
    }
    public void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
