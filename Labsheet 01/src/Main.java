import java.util.Scanner;


public class Main {

    public static void question07(){

        Scanner input = new Scanner(System.in);

        System.out.println("Celsius: ");
        Temperature temp = new Temperature(input.nextFloat());

        System.out.println("Fahrenheit: "+ temp.convert());


    }

    public static void question08(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Two Integers: ");

        Swap swap = new Swap(input.nextInt(), input.nextInt());

        swap.done();
    }

    public static void question09(){

        System.out.println("BMI values");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("30 or greater\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Weight(in kilograms) and Height (in meters) [Order is Important]: ");
        BmiCalculator bmi = new BmiCalculator(input.nextFloat(), input.nextFloat());

        System.out.println("Your BMI is " + bmi.calculate());

    }

    public static void question10(){
        Pyramid pyramid = new Pyramid();

        pyramid.patternPrint();
    }

    public static void main(String[] args){
        //question07();

        //question08();

        question09();

        //question10();
    }



}
