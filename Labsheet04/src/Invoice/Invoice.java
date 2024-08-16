package Invoice;

public class Invoice {
    public String partNumber;
    public String description;
    public int quantity;
    public double pricePerItem;

    public Invoice() {
        this.partNumber = null;
        this.description = null;
        this.quantity = 0;
        this.pricePerItem = 0.0d;
    }

    public Invoice(String partNumber) {
        this.partNumber = partNumber;
        this.description = null;
        this.quantity = 0;
        this.pricePerItem = 0.0d;
    }

    public Invoice(String partNumber, String description) {
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = 0;
        this.pricePerItem = 0.0d;
    }

    public Invoice(String partNumber, String description, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public Invoice(Invoice invoice2){
        this.partNumber = invoice2.partNumber;
        this.description = invoice2.description;
        this.quantity = invoice2.quantity;
        this.pricePerItem = invoice2.pricePerItem;
    }


}
