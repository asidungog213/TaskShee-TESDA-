public abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        // To be implemented by concrete classes
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        // To be implemented by concrete classes
        return 0;
    }
}