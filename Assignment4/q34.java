import java.util.Scanner;
class circleDemo {
    private float radius;
    private double area;

    void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : "); 
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
public class q34 {
    public static void main(String[] args) {
        circleDemo obj1 = new circleDemo();
        obj1.init();
        obj1.area();
        obj1.display();
    }
}