public class VehicleInheritanceExample {
    public static void main(String[] args){
        Car car = new Car("Benz", 2014);
        Motorcycle motorcycle = new Motorcycle("Honda", 2011);

        car.start();
        car.accelerate();
        car.honk();
        car.stop();

        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.wheelie();
        motorcycle.stop();
    }
}
