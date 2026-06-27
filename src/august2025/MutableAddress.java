package august2025;

public class MutableAddress {
    private String addressLine1;
    private int pinCode;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "MutableAddress{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
