public class Car extends Vehicle{

    public Car(String brand, int year) {
        super(brand, year);
    }

    public void honk(){
        System.out.println("Honking the horn of the "+ getYear()+ " " + getBrand() + " Car.");
    }
}
