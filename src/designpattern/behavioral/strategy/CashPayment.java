package designpattern.behavioral.strategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid Rs." + amount + " using Cash");
    }
}
