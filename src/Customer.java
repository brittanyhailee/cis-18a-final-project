class Customer {
    private String fname, lname, email;
    // Address address = new Address();

    public void setEmail(String e) {
        email = e;
    }

    public void setFname(String n) {
        fname = n;
    }

    public void setLname(String l) {
        lname = l;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
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
