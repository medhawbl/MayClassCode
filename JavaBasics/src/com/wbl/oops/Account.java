package com.wbl.oops;

public class Account {

	private int accountId=8987;
	public String accountHolderName;
	public String address;
	public String accoutType;
	public float amout;
	
	public void displayTrasactions(){
		System.out.println("Trasaction");
	}
	
	public void withdrawl(){
		System.out.println("Withdrawl");
	}
	
	/*public void setaccountId(int id){
		if(id>0){
			accountId = id;
		}else{
			System.out.println("this is not valid account number");			
		}
	}*/
	
	public int getaccountId(){
		return accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccoutType() {
		return accoutType;
	}

	public void setAccoutType(String accoutType) {
		this.accoutType = accoutType;
	}

	public float getAmout() {
		return amout;
	}

	public void setAmout(float amout) {
		this.amout = amout;
	}
}
