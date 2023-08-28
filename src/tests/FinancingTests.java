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
	public void setAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		//Assert
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			//Arrange
			Financing f1 = FinancingFactory.financingAtTheEdgeOfValidation();
			
			//Act
			f1.setTotalAmount(110000.0);
		});
	}
	
	
	
	@Test
	public void setIncomeShouldUpdateWhenValidData() {
		//Arrange
		Financing f1 = FinancingFactory.financingAtTheEdgeOfValidation();
		
		//Act
		f1.setIncome(2200.0);
		
		//Assert
		Assertions.assertEquals(2200.0, f1.getIncome());
	}
	
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		//Assert
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			//Arrange
			Financing f1 = FinancingFactory.financingAtTheEdgeOfValidation();
			
			//Act
			f1.setIncome(1900.0);
		});
	}
	

	
	@Test
	public void setMonthShouldUpdateWhenValidData() {
		//Arrange
		Financing f1 = FinancingFactory.financingAtTheEdgeOfValidation();
		
		//Act
		f1.setMonths(81);
		
		//Assert
		Assertions.assertEquals(81, f1.getMonths());
	}
	
	
	@Test
	public void setMonthShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		//Assert
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			//Arrange
			Financing f1 = FinancingFactory.financingAtTheEdgeOfValidation();
			
			//Act
			f1.setMonths(79);
		});
	}
	
	@Test
	public void entryShouldCalculatedEntryValueCorrectly() {
		//Arrenge
		Financing f1 = FinancingFactory.financingAtTheEdgeOfValidation();
		
		//Act
		f1.entry();
		
		//Assert
		Assertions.assertTrue(20000.0 == f1.entry());
	}
	
	
	@Test
	public void quotaShouldBeCalculatedCorrectly() {
		//Arrenge & Act
		Financing f1 = FinancingFactory.financingAtTheEdgeOfValidation();
		
		//Assert
		Assertions.assertTrue(1000.0 == f1.quota());
	}
	
	
	
}
