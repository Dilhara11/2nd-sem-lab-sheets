public class Main {

    public static void question01(){

        Student student = new Student();

        student.input();
        student.print();
    }

    public static void question02(){

        Length length = new Length();

        length.input();
        length.add();
        length.print();
    }

    public static void question03(){
        Person person = new Person();

        person.input();
        person.print();
    }

    public static void quesiton04(){

        Date date = new Date();

        date.input();
        date.print();
        date.printFormat01();
        date.printFormat02();
    }

    public static void question05(){
        Stock stock = new Stock("ORCL", "Oracle Coopration");

        stock.setPreviousClosingPrice(34.5);

        stock.setCurrentPrice(34.35);

        System.out.println("Stock Changed Percentage: " +stock.getChangedPercent()+ "%");

    }


    public static void main(String[] args){
        //question01();

        //question02();

        //question03();

        //quesiton04();

        question05();
    }
}
