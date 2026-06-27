package august2025;
//1. make clas final
//2. make all instance variable private and final
//3. keep only getters for all instance variables
//4. have only parameterized constructor for creating instance.
//5. deep copy of any mutable instance variable inside getter and constructor
public final class ImmutableCustomer {
    private final int id;
    private final String name;
    private final MutableAddress address;

    public ImmutableCustomer(int id, String name, MutableAddress address){
        this.id = id;
        this.name = name;
        MutableAddress immutAddress = new MutableAddress();
        immutAddress.setAddressLine1(address.getAddressLine1());
        immutAddress.setPinCode(address.getPinCode());
        this.address = immutAddress;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MutableAddress getAddress() {
        MutableAddress immutAddress = new MutableAddress();
        immutAddress.setAddressLine1(this.address.getAddressLine1());
        immutAddress.setPinCode(this.address.getPinCode());
        return immutAddress;
    }

    @Override
    public String toString() {
        return "ImmutableCustomer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
