import java.util.Scanner;

public class Length {
    private int length1;
    private int length2;
    private int totalLength;

    public void input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Length 01: ");
        length1 = input.nextInt();

        System.out.print("Enter Length 02: ");
        length2 = input.nextInt();
    }

    public void add(){

        totalLength = length1 + length2;
    }

    public void print(){
        System.out.println("Total Length is "+totalLength);
    }



}
