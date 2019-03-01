package com.cg.payroll.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Salary  {
	private int basicSalary , hra, conveyenceAllowance;
	private int otherAllowance , personalAllowance , monthlyTax , epf;
	private int companyPf;
	private int monthlyGrossSalary, netSalary;
	
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getConveyenceAllowance() {
		return conveyenceAllowance;
	}
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setConveyenceAllowance(int conveyenceAllowance) {
		this.conveyenceAllowance = conveyenceAllowance;
	}
	public int getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public int getPersonalAllowance() {
		return personalAllowance;
	}
	public void setPersonalAllowance(int personalAllowance) {
		this.personalAllowance = personalAllowance;
	}
	public int getMonthlyTax() {
		return monthlyTax;
	}
	public void setMonthlyTax(int monthlyTax) {
		this.monthlyTax = monthlyTax;
	}
	public int getEpf() {
		return epf;
	}
	public void setEpf(int epf) {
		this.epf = epf;
	}
	public int getCompanyPf() {
		return companyPf;
	}
	public void setCompanyPf(int companyPf) {
		this.companyPf = companyPf;
	}
	public int getMonthlyGrossSalary() {
		return monthlyGrossSalary;
	}
	public void setMonthlyGrossSalary(int grossSalary) {
		this.monthlyGrossSalary = grossSalary;
	}
	public Salary(int basicSalary2, int epf2, int companyPf2) {
		 this.basicSalary  = basicSalary2 ; 
		 this.epf = epf2;
		 this.companyPf = companyPf2;
	}
	public int getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + basicSalary;
		result = prime * result + companyPf;
		result = prime * result + conveyenceAllowance;
		result = prime * result + epf;
		result = prime * result + monthlyGrossSalary;
		result = prime * result + hra;
		result = prime * result + monthlyTax;
		result = prime * result + netSalary;
		result = prime * result + otherAllowance;
		result = prime * result + personalAllowance;
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
		Salary other = (Salary) obj;
		if (basicSalary != other.basicSalary)
			return false;
		if (companyPf != other.companyPf)
			return false;
		if (conveyenceAllowance != other.conveyenceAllowance)
			return false;
		if (epf != other.epf)
			return false;
		if (monthlyGrossSalary != other.monthlyGrossSalary)
			return false;
		if (hra != other.hra)
			return false;
		if (monthlyTax != other.monthlyTax)
			return false;
		if (netSalary != other.netSalary)
			return false;
		if (otherAllowance != other.otherAllowance)
			return false;
		if (personalAllowance != other.personalAllowance)
			return false;
		return true;
	}

;
}
