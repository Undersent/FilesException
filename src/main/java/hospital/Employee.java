package hospital;

public abstract class Employee {
    protected String name;
    private final String surname;
    private Address address;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Employee(String name, String surname, String city, String street, String postalCode) {
        this.name = name;
        this.surname = surname;
        this.address = new Address(city, street, postalCode);
    }

    public abstract String introduce();

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }
}
