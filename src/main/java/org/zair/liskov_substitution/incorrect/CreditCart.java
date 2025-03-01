package org.zair.liskov_substitution.incorrect;

public class CreditCart extends PaymentMethod {

    @Override
    public void pay(Integer amount) {
        System.out.println("Paying " + amount + " with credit card");
    }

    @Override
    public void refund(Integer amount) {
        System.out.println("Refunding " + amount + " with credit card");
    }
}
