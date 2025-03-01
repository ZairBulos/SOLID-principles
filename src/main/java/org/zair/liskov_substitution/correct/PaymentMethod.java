package org.zair.liskov_substitution.correct;

// ✅ Después: Aplicando LSP
public abstract class PaymentMethod {

    public abstract void pay(Integer amount);

    public abstract boolean refund(Integer amount);
}
