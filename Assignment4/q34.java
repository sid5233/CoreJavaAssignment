import java.util.Scanner;
class q34 {
    private float radius;
    private double area;

    void init(){
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
    }
    void area(){
        area = 3.14 * radius *radius;
    }
    void display(){
        System.out.println("Radius is : "+radius);
        System.out.println("Area is : "+area);
    }
}
class circleDemo {
    public static void main(String[] args) {
        q34 cir = new q34();
        cir.init();
        cir.area();
        cir.display();
    }
}