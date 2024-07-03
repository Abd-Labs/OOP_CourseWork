package Task5;
public class Address {
    private String streetAddress;
    private String Town;
    private String city;
    private String Country;

    public Address(String streetAddress, String town, String city, String country) {
        this.streetAddress = streetAddress;
        Town = town;
        this.city = city;
        Country = country;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "{" +
                "streetAddress='" + streetAddress + '\'' +
                ", Town='" + Town + '\'' +
                ", city='" + city + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
