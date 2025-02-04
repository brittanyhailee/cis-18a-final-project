class Customer {
    private String fname, lname, email;
    Address address = new Address();

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
    String street;
    String city;
    String state;
    int zip;

    public void setStreetAddr(String s) {
        street = s;
    }

    public void setCity(String c) {
        city = c;
    }

    public void setState(String s) {
        state = s;
    }

    public void setZip(int z) {
        zip = z; 
    }

    public String getStreetAddr() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

}

// class Test {
//     public static void main(String[] args) {
//         Customer customer = new Customer();
//         customer.address.city = "Glendale";
//         System.out.print("Customer lives in " + customer.address.city);
//     }
// }
