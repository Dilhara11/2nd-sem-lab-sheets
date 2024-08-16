package Cordinates;

public class Main {
    public static void main(String[] args){
        Cord cord = new Cord();
        System.out.println("Rooster Form: " +cord.toString());
        System.out.println("Distance: "+cord.distance(5, 6));
        Cord cord2 = new Cord(4, 7);
        System.out.println("Rooster Form: " +cord2.toString());
        System.out.println("Distance: "+cord.distance(8, 3));
    }
}
