package src.exercise5.A2;

public class CheckoutService {

    private final PaymentProvider p;

    public CheckoutService(PaymentProvider p) {

        this.p = p;
    }

    public void processPayment(double amount){
        p.pay(amount);
    }

}
