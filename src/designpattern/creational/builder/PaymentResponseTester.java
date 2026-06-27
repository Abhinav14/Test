package designpattern.creational.builder;

public class PaymentResponseTester {
    public static void main(String[] args) {
        PaymentResponse response = new PaymentResponse.Builder("TXN-001", 2500.00, "SUCCESS").bankName("HDFC").build();
        System.out.println(response);
    }
}
