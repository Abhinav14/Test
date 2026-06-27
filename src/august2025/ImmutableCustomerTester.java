package august2025;

public class ImmutableCustomerTester {
    public static void main(String[] args) {
        MutableAddress address = new MutableAddress();
        address.setAddressLine1("Gurgaon");
        address.setPinCode(122006);

        ImmutableCustomer customer = new ImmutableCustomer(1, "Abhinav", address);

        System.out.println(customer);

        customer.getAddress().setAddressLine1("Noida");

        System.out.println(customer);
    }
}
