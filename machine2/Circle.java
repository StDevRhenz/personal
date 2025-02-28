package machine2;


class Circle {
    private double radius;
    private final double pi;


    public Circle() {
        this.radius = 1.0;
        this.pi = 3.1416;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * pi * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circumference of Circle 1: " + circle1.getCircumference());


        Circle circle2 = new Circle();
        circle2.setRadius(5.0);
        System.out.println("Circumference of Circle 2: " + circle2.getCircumference());
    }
}
