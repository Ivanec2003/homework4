public class Rectangle implements Shape {
    private final double base;//the base side of the triangle
    private final double height;
    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of rectangle: " + area);
    }
}
