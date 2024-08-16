package Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 0;
        this.color = "Red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "Red";
    }

    public Circle(String color) {
        this.radius = 1;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
