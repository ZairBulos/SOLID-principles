package org.zair.liskov_substitution.incorrect;

// ❌ Antes: Sin usar LSP
public abstract class PaymentMethod {

    public abstract void pay(Integer amount);

    public abstract void refund(Integer amount);
}
