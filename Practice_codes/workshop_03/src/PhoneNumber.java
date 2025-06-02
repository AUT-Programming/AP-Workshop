public class PhoneNumber {
    private final String countryCode;
    private final String number;

    public PhoneNumber(String countryCode, String number) {
        this.countryCode = "(" + countryCode + ")";
        this.number = number;
    }

    public String toString(){
        return countryCode + " " + number;
    }
}
