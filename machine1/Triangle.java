
package machine1;

public class Triangle {


    private double side1, side2, side3;


    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2; 
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        double perimeter = triangle.calculatePerimeter();
        System.out.println("Perimeter of the triangle: " + perimeter + " units");
        double area = triangle.calculateArea();
        System.out.println("Area of the triangle: " + area + " square units");
    }
}
