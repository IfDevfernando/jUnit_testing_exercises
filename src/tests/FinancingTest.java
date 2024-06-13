package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTest {
	
	@Test
	public void constructorShouldCreateCorrectObjectWhenIsValidData() {
		
		double total = 100000.0;
		double icome = 2000.0;
		int months = 84;
		
		Financing fin = new Financing(total, icome, months);
		
		Assertions.assertTrue( fin != null);
		Assertions.assertEquals(total, fin.getTotalAmount());
		Assertions.assertEquals(icome, fin.getIncome());
		Assertions.assertEquals(months, fin.getMonths());
		
		
	}
	@Test
	public void construtionDShouldExceptionWhenIlleganData() {
		
		
		Assertions.assertThrowsExactly(IllegalArgumentException.class, () ->{
			
			
			Financing fin = new Financing(100000.0, 2000.0, 20);
			
		});
		
	}

	@Test
	public void updateShouldvalueWhenDataIsValid() {
		
		
		Financing fin = new Financing(100000.0, 2000.0, 84);
		
		double newTotal = 80000.0;
		
		fin.setTotalAmount(newTotal);
		
		Assertions.assertEquals(newTotal, fin.getTotalAmount());
		
	
	}
	
	@Test
	public void updateShouldInvalidWhenArgumentsIsInvalid() {
		
		Assertions.assertThrowsExactly(IllegalArgumentException.class, () ->{
			
			Financing fin = new Financing(100000.0, 2000.0, 80);
			
			fin.setTotalAmount(110000.0);
				
		});
	}
	@Test
	public void updateShouldIcomeWhenValidArgument() {
		
		Financing fin = new Financing(100000.0, 2000.0, 84);

		double newIcome = 3200.0;

		fin.setIncome(newIcome);

		Assertions.assertEquals(newIcome, fin.getIncome());
		
	}
	@Test
	public void updateShouldIcomeWhenInvalidArgument() {
		
		Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {

			Financing fin = new Financing(100000.0,3200.0, 80);

			fin.setIncome(1500.0);
			

		});
	}
	
	@Test
	public void updateShouldMonthWhenValidArgument() {
		
		Financing fin = new Financing(100000.0, 4500.0, 84);

		int newMonth = 75;

		fin.setMonths(newMonth);

		Assertions.assertEquals(newMonth, fin.getMonths());
		
	}
	@Test
	public void updateShouldMonthWhenInvalidArgument() {
		
		Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {

			Financing fin = new Financing(100000.0,2000.0, 80);

			fin.setMonths(3);

		});
	}
	@Test
	public void calculeShouldCorrectValueFinnace() {
		
		
		double expectaValue = 200.0;
		
		Financing fin = new Financing(1000.0, 2600.0, 12);
		
		
		
		Assertions.assertEquals(expectaValue, fin.entry());
		
		
	}
	@Test
	public void calculeShouldCorrectValueQuota() {
		
		double expectativeValue = 80.0;
		
		Financing fin = new Financing(1000.0, 2600.0, 10);
		
		Assertions.assertEquals(expectativeValue, fin.quota());
		
	}
}

