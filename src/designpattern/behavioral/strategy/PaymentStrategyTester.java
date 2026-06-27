package designpattern.behavioral.strategy;

public class PaymentStrategyTester {
    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(1000);

        context.setPaymentStrategy(new UpiPayment());
        context.makePayment(500);
    }
}
