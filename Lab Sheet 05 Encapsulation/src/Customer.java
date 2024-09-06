public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }


}

class TestCustomer{
    public static void main(String[] args){
        Customer customer = new Customer(123, "Achintha", 'M');
        System.out.println(customer.getId());
        System.out.println(customer.getName());
        System.out.println(customer.getGender());
        System.out.println(customer);
    }
}
