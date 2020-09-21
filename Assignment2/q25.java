class q25 {
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5,6,7,8,9};
         int eSum=0,oSum=0;
         for(int a=0; a<arr.length;a++){
            if ( (arr[a]%2) == 0 )
                {
                    eSum = eSum+arr[a];
                }
             else {
                 oSum = oSum + arr[a];
             }
        }
        System.out.println("sum of even = "+eSum);
        System.out.println("sum of odd = "+oSum);
    }   
}