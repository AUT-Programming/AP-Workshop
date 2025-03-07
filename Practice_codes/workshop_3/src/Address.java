public class Address {
    private final String zipCode;
    private final String country;
    private final String city;

    public Address(String zipCode, String country, String city) {
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
    }

    public String toString (){
        return zipCode + " / " + country + " / " + city;
    }
}
