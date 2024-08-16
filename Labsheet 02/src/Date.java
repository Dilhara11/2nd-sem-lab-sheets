import java.util.Scanner;

public class Date {
    private int date;
    private int month;
    private int year;

    public void input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Date: ");
        date = input.nextInt();
        System.out.print("Enter month: ");
        month = input.nextInt();
        System.out.print("Enter Date: ");
        year = input.nextInt();
    }

    public void print(){
        System.out.println(year+"/"+month+"/"+date);
    }

    public void printFormat01(){
        System.out.println(date+"."+month+"."+year);
    }

    public void printFormat02(){
        String monthName;
        String suffix = "th";

        monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };

        suffix = switch (date) {
            case 1, 21, 31 -> "st";
            case 2, 22 -> "nd";
            case 3, 23 -> "rd";
            default -> suffix;
        };

        System.out.println(date+ suffix +" "+ monthName + " " + year);
    }


}
