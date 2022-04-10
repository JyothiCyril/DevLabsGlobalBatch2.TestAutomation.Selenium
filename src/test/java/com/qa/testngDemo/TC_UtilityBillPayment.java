package com.qa.testngDemo;

import org.testng.annotations.Test;

public class TC_UtilityBillPayment extends TestBase{
	
	@Test(groups="BillPayment",priority=0)
	public void UtilityBillPayment() {
		System.out.println("Loc for utility bill payment");
	}
	
	@Test(groups="Insurance",priority=1)
	public void HealthInsurancePayment() {
		System.out.println("Loc for paying Health insurance");
	}

	@Test(groups="Insurance",priority=2)
	public void VehicleInsurancePayment() {
		System.out.println("Loc for paying Vehicle insurance");
	}
}
