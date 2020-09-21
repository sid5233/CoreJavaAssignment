class mathOper {
    void multiply ( int a, int b){
        System.out.println("a : " +(a*b));
    }
    void multiply(float a,float b, float c){
        System.out.println("b : " +(a*b*c));
    }
    void multiply(double a,int b){
        System.out.println("d : " +(a*b));
    }
}
class q36 {
    public static void main(String[] args) {
        mathOper obj1 = new mathOper();
        obj1.multiply(5,5);
        obj1.multiply(1.5f,1.5f,5.54f);
        obj1.multiply(54.1d,11);
        
    }
}