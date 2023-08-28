package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		
		//action
		Financing f1 = FinancingFactory.financingAtTheEdgeOfValidation();
		
		//assertions
		Assertions.assertEquals(100000.0, f1.getTotalAmount());
		Assertions.assertEquals(2000.0, f1.getIncome());
		Assertions.assertEquals(80, f1.getMonths());
	}
	
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//action
			Financing f1 = FinancingFactory.financingInvalid();
		});
	}
	
	@Test
	public void setAmountShouldUpdateAmountWhenValidData() {
		//Arrange
		Financing f1 = FinancingFactory.financingAtTheEdgeOfValidation();
		
		//Act
		f1.setTotalAmount(90000.0);
		
		//Assert
		Assertions.assertEquals(90000.0, f1.getTotalAmount());
	}
	
	
	@Test
	public void setAmountShouldNotUpdateAmountWhenInvalidData() {
		//Assert
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			//Arrange
			Financing f1 = FinancingFactory.financingAtTheEdgeOfValidation();
			
			//Act
			f1.setTotalAmount(110000.0);
		});
	}
	
	

}
