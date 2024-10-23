package entities;

public class CurrencyConverter {

	public double dollarPrice;
	public double quantityInReal;
	
	public double amountInReal() {
		return (dollarPrice * quantityInReal) * (6/100.0 + 1.0);
	}
	
}
