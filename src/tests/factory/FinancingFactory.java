package tests.factory;

import entities.Financing;

public class FinancingFactory {
	
	public static Financing financingAtTheEdgeOfValidation() {
		return new Financing(100000.0, 2000.0, 80);
	}
	
	
	public static Financing financingInvalid() {
		return new Financing(100000.0, 2000.0, 20);
	}

}
