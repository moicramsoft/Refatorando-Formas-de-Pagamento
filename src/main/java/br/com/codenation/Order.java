package br.com.codenation;

import br.com.codenation.paymentmethods.PaymentMethod;

public class Order {

	public Double price;
	public PaymentMethod paymentMethod;

    public Order(Double price, PaymentMethod paymentMethod) {
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    public Double getPrice() {
        return price;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
