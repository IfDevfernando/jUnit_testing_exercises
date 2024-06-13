package factory;

import entities.Financing;

public class FinancingFactory {
	
	
	public static Financing createObject(double totalAmount,double icome, int months) {
		
		return new Financing(totalAmount, icome, months);
		
	}

}
