import java.util.Scanner;

public class Student {

    private int age;
    private String name;

    public void input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        name = input.nextLine();

        System.out.print("Enter Your Age: ");
        age = input.nextInt();
    }

    public void print(){
        System.out.println("My name is " +name+ "and I am " +age+ " years old");
    }
}
