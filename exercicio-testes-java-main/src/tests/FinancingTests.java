package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		//arrange
		//action
		Financing f = new Financing (100000.0, 2000.0, 80);
		//assert
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void constructorShouldIllegalArgumentExceptiontWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing f = new Financing (100000.0, 2000.0, 20);
		});
	}
	
	
	
	
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		//arrange
		Financing f = new Financing (100000.0, 2000.0, 80);
		//action
		f.setTotalAmount(90000.0);
		//assert
		Assertions.assertEquals(90000.0, f.getTotalAmount());

	}
	
	@Test
	public void setTotalAmountShouldIllegalArgumentExceptiontWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing f = new Financing (100000.0, 2000.0, 80);
			f.setTotalAmount(1100000.0);
		});
	}

	
	
	
	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		//arrange
		Financing f = new Financing (100000.0, 2000.0, 80);
		//action
		f.setIncome(2100.0);
		//assert
		Assertions.assertEquals(2100.0, f.getIncome());

	}
	
	@Test
	public void setIncomeShouldIllegalArgumentExceptiontWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing f = new Financing (100000.0, 2000.0, 80);
			f.setIncome(1900.0);
		});
	}
	
	@Test
	public void setMonthsShouldSetDataWhenValidData() {
		//arrange
		Financing f = new Financing (100000.0, 2000.0, 80);
		//action
		f.setMonths(81);
		//assert
		Assertions.assertEquals(81, f.getMonths());

	}
	
	@Test
	public void setMonthsShouldIllegalArgumentExceptiontWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing f = new Financing (100000.0, 2000.0, 80);
			f.setMonths(79);
		});
	}
	
	
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		Financing f = new Financing (100000.0, 2000.0, 80);
		
		Assertions.assertEquals(20000.0, f.entry());
	}
	
	@Test
	public void quotaShouldCalculateEntryCorrectly() {
		Financing f = new Financing (100000.0, 2000.0, 80);
		
		Assertions.assertEquals(1000.0, f.quota());
	}
	
	 
	
}
