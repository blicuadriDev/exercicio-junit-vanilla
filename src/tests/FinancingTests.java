package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		
		//action
		Financing f1 = new Financing (100000.0, 2000.0, 80);
		
		//assertions
		Assertions.assertEquals(100000.0, f1.getTotalAmount());
		Assertions.assertEquals(2000.0, f1.getIncome());
		Assertions.assertEquals(80, f1.getMonths());
	}
	
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//action
			Financing f1 = new Financing (100000.0, 2000.0, 20);
		});

		

	}
	
	
	
	

}
