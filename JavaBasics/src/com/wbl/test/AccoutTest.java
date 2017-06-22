package com.wbl.test;

import com.wbl.oops.Account;

public class AccoutTest {

	public static void main(String[] args) {
		
		Account a = new Account();
		//a.accountId = 7897;
		//a.setaccountId(-5675);
		a.accountHolderName = "Priya";
		a.withdrawl();
		a.displayTrasactions();
		System.out.println("Account Id" + a.getaccountId());
		System.out.println("Account Holders Name" + a.accountHolderName);
	}
	

}
