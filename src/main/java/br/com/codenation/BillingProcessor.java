/*Fonte para uso de 
 * SOLID: Single Responsibility Principle
 * https://www.eduardopires.net.br/2013/05/single-responsibility-principle-srp/
 * */
package br.com.codenation;

import br.com.codenation.paymentmethods.PriceStrategy;

public class BillingProcessor {
	public class CashPayment implements PriceStrategy {

	    @Override
	    public Double calculate(Double price) {
	        return price * 0.9;
	    }
	public class CreditCardPayment implements PriceStrategy {

	   @Override
	   public Double calculate(Double price) {
	       return price * 0.98;
	   }
	      
	public class DebitCardPayment implements PriceStrategy {

	@Override
	public Double calculate(Double price) {
		  return price * 0.95;
	  }	   
	public class TransferPayment implements PriceStrategy {

	@Override
	public Double calculate(Double price) {
	return price * 0.92;
	}
	   
	   
    public Double calculate(Order order) {
        return order.getPaymentMethod().getPaymentStrategy().calculate(order.getPrice());
    }
	}
}
}}}