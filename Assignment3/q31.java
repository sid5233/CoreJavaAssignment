class studentDemo1 {
  private int rno;
  private String name;
 
  void setData1(int rno1, String name1) {
    this.rno = rno1;
    this.name = name1;
   }

  void showData1() {
    System.out.println(rno);
    System.out.println(name);
  }
}
class q31 {
    public static void main(String[] args) {
      studentDemo1 obj1 = new studentDemo1();
      obj1.setData1(1, "sudarshan");
      obj1.showData1();

    }
}
