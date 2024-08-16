package Invoice;

public class Main {
    public static void main(String[] args){
        Invoice invoice = new Invoice("P123", "Bolt nut", 3, 75.0);
        Invoice invoice1 = new Invoice(invoice);

        System.out.println(invoice1.partNumber);
        System.out.println(invoice1.description);
        System.out.println(invoice1.quantity);
        System.out.println(invoice1.pricePerItem);
    }
}
