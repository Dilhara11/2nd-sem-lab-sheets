public class Swap {

    private int number1;
    private int number2;

    public Swap(int number1, int number2) {
        this.number2 = number2;
        this.number1 = number1;
    }

    public void done(){
        number2 = number2 * number1;
        number1 = number2/number1;
        number2 = number2/number1;

        System.out.println("Number 1 : " +number1+ " Number 2: " + number2);
    }
}
