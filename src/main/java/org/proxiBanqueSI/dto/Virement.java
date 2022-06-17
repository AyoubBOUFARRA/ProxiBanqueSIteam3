package org.proxiBanqueSI.dto;

public class Virement {
	
	private String firstname;
	private String lastname;	
	private String accountId;	
	private float transfertAmount;
	public String getFirstname() {
		return firstname;
	}
	
	public Virement(String firstname, String lastname, String accountId, float transfertAmount) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountId = accountId;
		this.transfertAmount = transfertAmount;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public float getTransfertAmount() {
		return transfertAmount;
	}
	public void setTransfertAmount(float transfertAmount) {
		this.transfertAmount = transfertAmount;
	}
	
	
}
