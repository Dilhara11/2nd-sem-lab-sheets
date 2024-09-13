public class Motorcycle extends Vehicle{

    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    public void wheelie(){
        System.out.println("Popping a wheelie on the "+ getYear()+ " " + getBrand() + " Motorcycle.");
    }
}
