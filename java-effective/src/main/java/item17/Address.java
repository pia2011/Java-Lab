package item17;

public final class Address {

    private final String street;
    private final String city;
    private final String state;
    private final String postalCode;
    private final CanModify canModify;

    private Address(String street, String city, String state, String postalCode, CanModify canModify) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.canModify = canModify;
    }

    public static Address of(String street, String city, String state, String postalCode, CanModify canModify) {
        // 방어적 복사 수행
        return new Address(street, city, state, postalCode, new CanModify(canModify.name()));
    }

    public CanModify getCanModify() {
        // 반환할 때도 새로운 인스턴스를 전달
        return new CanModify(canModify.name());
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

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", canModify='" + canModify + '\'' +
                '}';
    }
}