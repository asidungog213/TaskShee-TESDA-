public class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); // Circle doesn't have length and width
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}