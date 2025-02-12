class Customer {
    private String fname, lname, email;
    Address address = new Address(); // Create address object for user. 
    // So, in the Controller.java, address is obtained through the user object. 

    // Create setter fucntions
    public void setEmail(String e) {
        email = e;
    }

    public void setFname(String n) {
        fname = n;
    }

    public void setLname(String l) {
        lname = l;
    }

    // Create getter functions
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