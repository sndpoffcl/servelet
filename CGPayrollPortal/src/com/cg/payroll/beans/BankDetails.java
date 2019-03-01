package com.cg.payroll.beans;

import javax.persistence.Embeddable;

@Embeddable
public class BankDetails {
	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankDetails(int accountNumber2, String bankName2, String ifscCode2) {
		this.accountNumber = accountNumber2;
		this.bankName = bankName2;
		this.ifscCode = ifscCode2;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((ifscCode == null) ? 0 : ifscCode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankDetails other = (BankDetails) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (ifscCode == null) {
			if (other.ifscCode != null)
				return false;
		} else if (!ifscCode.equals(other.ifscCode))
			return false;
		return true;
	}

	private int accountNumber;
	private String bankName , ifscCode;
}
