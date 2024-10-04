public class Converter {
    public static int convert(double number){
        return (int)number;
    }

    public static double convert(int number){
        return (double) number;
    }

    public static int convert(String number){
        return Integer.parseInt(number);
    }
}

class TestConverter{
    public static void main(String[] args){
        System.out.println(Converter.convert(12.323));
        System.out.println(Converter.convert(21));
        System.out.println(Converter.convert("12345"));
    }
}
