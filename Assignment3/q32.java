class q32 {
    private int rno;
    private String name;
    private static int objcounter=0;
  
    void setData1(int rno1, String name1) {
      this.rno = rno1;
      this.name = name1;
      objcounter++;    
    }
  
    void showData1() {
      System.out.println(rno);
      System.out.println(name);
    }
  }
  class studentDemo2 {
      public static void main(String[] args) {
        q31 obj1 = new q31();
        obj1.setData1(1, "sudarshan");
        obj1.showData1();
        q31 obj2 = new q31();
        obj2.setData1(2, "Vinay");
        obj2.showData1();
      }
  }
  