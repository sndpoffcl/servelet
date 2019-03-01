package com.cg.payroll.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Associate {
	public Associate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int associateId;
	private int yearlyInvcestmentUnder80C;
	private String firstName, lastName , department , designation , pancard , emailId;
	@Embedded
	private Salary salary;
	@Embedded
	private BankDetails bankDetails;
	
	public Salary getSalary() {
		return salary;
	}


	public void setSalary(Salary salary) {
		this.salary = salary;
	}


	public BankDetails getBankDetails() {
		return bankDetails;
	}


	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	
	@Override
	public String toString() {
		return "Associate [yearlyInvcestmentUnder80C=" + yearlyInvcestmentUnder80C + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", department=" + department + ", designation=" + designation
				+ ", pancard=" + pancard + ", emailId=" + emailId + ", associateId=" + associateId + "]";
	}
	 
	
	public Associate(int yearlyInvestmentUnder80C, String firstName2, String lastName2, String department2, String designation2, String panCard2, String emailId2, Salary salary, BankDetails bankDetails) {
		this.yearlyInvcestmentUnder80C = yearlyInvestmentUnder80C;
		this.firstName = firstName2 ; 
		this.lastName = lastName2;
		this.department = department2;
		this.designation = designation2;
		this.pancard = panCard2;
		this.emailId = emailId2;
		this.salary= salary;
		this.bankDetails = bankDetails;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + associateId;
		result = prime * result + ((bankDetails == null) ? 0 : bankDetails.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((pancard == null) ? 0 : pancard.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + yearlyInvcestmentUnder80C;
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
		Associate other = (Associate) obj;
		if (associateId != other.associateId)
			return false;
		if (bankDetails == null) {
			if (other.bankDetails != null)
				return false;
		} else if (!bankDetails.equals(other.bankDetails))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (pancard == null) {
			if (other.pancard != null)
				return false;
		} else if (!pancard.equals(other.pancard))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (yearlyInvcestmentUnder80C != other.yearlyInvcestmentUnder80C)
			return false;
		return true;
	}


	public Associate(int associateId,int yearlyInvestmentUnder80C, String firstName2, String lastName2, String department2, String designation2, String panCard2, String emailId2, Salary salary, BankDetails bankDetails) {
		this.associateId=associateId;
		this.yearlyInvcestmentUnder80C = yearlyInvestmentUnder80C;
		this.firstName = firstName2 ; 
		this.lastName = lastName2;
		this.department = department2;
		this.designation = designation2;
		this.pancard = panCard2;
		this.emailId = emailId2;
		this.salary= salary;
		this.bankDetails = bankDetails;
	}
	
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public int getYearlyInvcestmentUnder80C() {
		return yearlyInvcestmentUnder80C;
	}
	public void setYearlyInvcestmentUnder80C(int yearlyInvcestmentUnder80C) {
		this.yearlyInvcestmentUnder80C = yearlyInvcestmentUnder80C;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
