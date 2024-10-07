abstract class Vehicle {
    private final String make;
    private final String model;
    private final int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    abstract void displayInfo();

    @Override
    public String toString(){
        return make +" " + model +" "+year;
    }
}

class Car extends Vehicle{
    int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayInfo() {
        System.out.println("Car: " + this);
        System.out.println("Number 0f Doors: " + numberOfDoors);
    }
}

class Motorcycle extends Vehicle{

    boolean hasFairing;

    public Motorcycle(String make, String model, int year, boolean hasFairing) {
        super(make, model, year);
        this.hasFairing = hasFairing;
    }

    @Override
    void displayInfo() {
        System.out.println("Motorcycle: " + this);
        System.out.println("Has Fairing: " + (hasFairing? "Yes":"No"));
    }
}

class Main{
    public static void main(String[] args){

        Vehicle vehicle1 = new Car("Toyota", "Camry", 2022, 4);

        Vehicle vehicle2 = new Motorcycle("Harley-Davidson", "Sportster", 2021, true);

        vehicle1.displayInfo();
        System.out.println("\n");
        vehicle2.displayInfo();
    }
}
