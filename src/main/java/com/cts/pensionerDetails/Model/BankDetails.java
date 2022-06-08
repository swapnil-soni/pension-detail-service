package com.cts.pensionerDetails.Model;


/**
 *  @author Srikant Babu
 *  @author 894137
 * This is BankDetail class which contains the Bank details
 * like bankName, bankType, accountNumber
 *
 */


public class BankDetails {
	
	
	private String bankName;
	private long accountNumber;
	private String bankType;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public BankDetails() {
		
	}
	public BankDetails(String bankName, long accountNumber, String bankType) {
		
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankType = bankType;
	}
	

}
