class Customer {
    private String fname, lname, email;
    Address address = new Address(); // Create address object for user. 
    // So, in the Controller.java, address is obtained through the user object. 

    // Create setter functions for email, first and last name
    public void setEmail(String e) {
        email = e;
    }

    public void setFname(String n) {
        fname = n;
    }

    public void setLname(String l) {
        lname = l;
    }

    // Create getter functions for email, first and last name
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
    // Creates the blueprint for the address. Address will ask for street name, city, state, and zip
    String street;
    String city;
    String state;
    int zip;

    // Setter functions
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

    // Getter functions
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