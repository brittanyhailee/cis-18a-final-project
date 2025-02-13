package classes;
public class Customer {
    private String fname, lname, email;
    public Address address = new Address(); // Create address object for user. 
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
