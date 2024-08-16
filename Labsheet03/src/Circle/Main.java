package Circle;

public class Main {

    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println("Color: "+circle.getColor()+"\nRadius: "+circle.getRadius());
        Circle circle1 = new Circle(5);
        System.out.println("Color: "+circle1.getColor()+"\nRadius: "+circle1.getRadius());
        Circle circle2 = new Circle("Blue");
        System.out.println("Color: "+circle2.getColor()+"\nRadius: "+circle2.getRadius());

    }
}
