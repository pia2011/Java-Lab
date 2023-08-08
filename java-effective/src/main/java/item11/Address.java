package item11;

public class Address {

    private final String street;
    private final String city;
    private final String state;
    private final String postalCode;

    private Address(String street, String city, String state, String postalCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public static Address of(String street, String city, String state, String postalCode) {
        return new Address(street, city, state, postalCode);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }else{
            if(obj instanceof Address){
                Address address = (Address) obj;

                if (!street.equals(address.street)) return false;
                if (!city.equals(address.city)) return false;
                if (!state.equals(address.state)) return false;
                return postalCode.equals(address.postalCode);
            }
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = street.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + postalCode.hashCode();
        return result;
    }
}
