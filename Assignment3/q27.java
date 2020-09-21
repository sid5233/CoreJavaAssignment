class q27{
    public static void main(String[] args) {
        int arr[] = {5,3,57,8,9,45,64,2,57,98};
        int small= arr[0];
        int big = arr[0];
        for(int i=1;i<arr.length; i++)
        {
            if  (arr[i] > big ){
                 big = arr[i];
            }   
            if (arr[i] < small)
            {
                small = arr[i];
            }
       }
       System.out.println("Largest Num is "+big);
       System.out.println("Smallest Num is "+small);
}
}