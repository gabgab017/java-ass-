import Circle.circle;
import Cylinder.cylinder;

public class App {
    public static void main(String[] args) throws Exception {
    
        circle circle1 = new circle(10, 20);

        System.out.println("Area of circle: " + circle1.getArea());
        System.out.println("Parameter of circle: " + circle1.getParameter());

        cylinder cylinder1 = new cylinder(15, 8);

        System.out.println("Volume of cylinder: " + cylinder1.getVolume());
    }
}
