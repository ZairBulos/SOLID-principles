package org.zair.liskov_substitution.correct;

public class CreditCart extends PaymentMethod {

    @Override
    public void pay(Integer amount) {
        System.out.println("Paying " + amount + " with credit card");
    }

    @Override
    public boolean refund(Integer amount) {
        System.out.println("Refunding " + amount + " with credit card");
        return true;
    }
}
