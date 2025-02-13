package classes;

public class Address {
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