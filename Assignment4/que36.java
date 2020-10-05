class MathOperation {
      void multiply(int a,int b) {
    	int res = a*b;
    	System.out.println(res);
    }
      void multiply(float a,float b,float c) {
    	float res = a *b *c;
    	System.out.println( res );
    }
      void multiply(int array[]) {
    	  int mul = 1;
    	  for (int i=0;i<array.length; i++) {
    		  mul = mul * array[i];
    	  }
    	  System.out.println(mul);
      }
      void multiply(int a, double b) {
    	  double res = a * b;
    	  System.out.println(res);
      }
}

public class que36 {
	public static void main(String[] args) {
		MathOperation m1 = new MathOperation();
		m1.multiply(10,20);
		m1.multiply(10.5f,20.54f,65.65f);
		int array[] = {1,3,5,8};
		m1.multiply(array);
		m1.multiply(10,20.24);
	}
}