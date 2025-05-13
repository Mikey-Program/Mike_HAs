package src.exercise5.A2;

public class PayPalPayment implements PaymentProvider{

    @Override
    public void pay(double amount) {
        System.out.println("Mit PayPal bezahlt: " + amount);
    }
}
