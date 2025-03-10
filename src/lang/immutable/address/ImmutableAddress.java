package lang.immutable.address;

public class ImmutableAddress {

    private final String value; // value 값을 바꾸는게 불가능 (불변 객체)

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // setValue() 삭제

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
