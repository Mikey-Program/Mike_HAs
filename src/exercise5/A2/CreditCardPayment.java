package src.exercise5.A2;

public class CreditCardPayment implements PaymentProvider{

    @Override
    public void pay(double amount) {
        System.out.println("Mit KreditKarte bezahlt: " + amount);
    }
}
