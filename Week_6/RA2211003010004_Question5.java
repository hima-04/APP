import java.util.Scanner;
abstract class RA221100301002_Shape {
    abstract double getPerimeter();
    abstract double getArea();
}
class RA221100301002_Circle extends RA221100301002_Shape {
    private double radius;

    public RA221100301002_Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
public class RA2211003010004_Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = scan.nextDouble();
        RA221100301002_Circle circle = new RA221100301002_Circle(radius);
        System.out.println("The perimeter of the circle is: " + circle.getPerimeter());
        System.out.println("The area of the circle is: " + circle.getArea());
        scan.close();
    }
}
