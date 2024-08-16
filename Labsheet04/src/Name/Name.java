package Name;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name() {
        this.firstName = null;
        this.middleName = null;
        this.lastName = null;
    }

    public Name(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.firstName = null;
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        return firstName + middleName + lastName;
    }

    public String MyName(){
        char firstInitial, secondInitial;
        firstInitial = this.firstName.toUpperCase().charAt(0);
        secondInitial = this.middleName.toUpperCase().charAt(0);
        String myName = firstInitial + "." + secondInitial + "." + lastName;
        return myName;
    }
}
