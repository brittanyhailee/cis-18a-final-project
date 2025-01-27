class Customer {
    String fname, lname;
    Address address = new Address();

}

class Address {
    int houseNum;
    String street;
    String city;
    String state;
    int zip;

}

class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.address.city = "Glendale";
        System.out.print("Customer lives in " + customer.address.city);
    }
}
