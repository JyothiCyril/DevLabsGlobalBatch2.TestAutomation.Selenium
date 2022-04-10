package com.qa.testngDemo;

import org.testng.annotations.Test;

public class TC_FundTransfer extends TestBase{
	
	@Test(priority=1)
	public void FundTransfrerNEFT() {
		System.out.println("LoC for Fund transfer using NEFT");
	}

	@Test(priority=2, invocationCount=5)
	public void FundTransferIMPS() {
		System.out.println("LoC for Fund transfer using IMPS");
	}
	
	@Test(priority=3, enabled=false)
	public void FundTransferInternational() {
		System.out.println("Loc for Fund transfer using international");
	}
}
