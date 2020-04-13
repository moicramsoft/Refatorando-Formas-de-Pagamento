package br.com.codenation;

import br.com.codenation.paymentmethods.PaymentMethod;

public class Order {

    private Double price;
    private PaymentMethod paymentMethod;

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

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
