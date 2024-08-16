import java.util.Scanner;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    public void input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        firstName = input.nextLine();
        System.out.print("Enter Middle Name: ");
        middleName = input.nextLine();
        System.out.print("Enter Last Name: ");
        lastName = input.nextLine();
    }

    public void print(){
        System.out.println("I am "+firstName+" "+middleName+" "+lastName);
    }
}
