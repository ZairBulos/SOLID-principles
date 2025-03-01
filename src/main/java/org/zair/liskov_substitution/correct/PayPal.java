package org.zair.liskov_substitution.correct;

public class PayPal extends PaymentMethod {

    private boolean canRefund;

    @Override
    public void pay(Integer amount) {
        System.out.println("Paying " + amount + " with PayPal");
    }

    @Override
    public boolean refund(Integer amount) {
        if (!canRefund) {
            return false;   // ✅ Comportamiento esperado
        }

        System.out.println("Refunding " + amount + " with PayPal");
        return true;
    }
}
