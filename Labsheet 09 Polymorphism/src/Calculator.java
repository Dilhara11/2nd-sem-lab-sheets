public class Calculator {

    public int add(int number1, int number2){
        return number1 + number2;
    }

    public int add(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }

    public int add(int[] numbers){
        int sum = 0;

//        for(int i = 0; i< numbers.length; i++){
//            sum += numbers[i];
//        }

//        use of for each method

        for(int number: numbers){
            sum += number;
        }

        return sum;
    }
}

class TestCalculator{
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(10, 20, 30));
        int[] numbers = {10, 20, 30, 40};
        System.out.println(calculator.add(numbers));
    }
}
