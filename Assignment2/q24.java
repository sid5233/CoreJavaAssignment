class q24 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int num = 3;
        boolean flag = false;
        for (int a=0; a< arr.length; a++ ){
            if (num == arr[a]){
                flag=true;
                break;
            }
            else
            {
                flag = false;
            }
        }
        if (flag==true){
            System.out.println("element found ");
        }
        else {
            System.out.println("element not found");
        }
        }
    }