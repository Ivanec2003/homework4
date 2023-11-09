public class Circle implements Shape{
    private final double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void area() {
        double area = Constants.Pi * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}
