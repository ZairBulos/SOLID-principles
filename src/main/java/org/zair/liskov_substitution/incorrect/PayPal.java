package org.zair.liskov_substitution.incorrect;

public class PayPal extends PaymentMethod {

    private boolean canRefund;

    @Override
    public void pay(Integer amount) {
        System.out.println("Paying " + amount + " with PayPal");
    }

    @Override
    public void refund(Integer amount) {
        if (!canRefund) {
            throw new RuntimeException("This payment method can't refund"); // ❌ Incumpliendo LSP
        }

        System.out.println("Refunding " + amount + " with PayPal");
    }
}
