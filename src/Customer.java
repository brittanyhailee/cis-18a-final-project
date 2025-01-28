class Customer {
    private String fname, lname;
    // Address address = new Address();

    public void setFname(String n) {
        fname = n;
    }

    public void setLname(String l) {
        lname = l;
    }

    public String getFname() {
        return fname;
    }

    public String setLname() {
        return lname;
    }


}

class Address {
    int houseNum;
    String street;
    String city;
    String state;
    int zip;

}

// class Test {
//     public static void main(String[] args) {
//         Customer customer = new Customer();
//         customer.address.city = "Glendale";
//         System.out.print("Customer lives in " + customer.address.city);
//     }
// }
