package com.cg.payroll.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exception.AssociateDetailNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;


@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private PayrollServices services;
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException
	{
		services=new PayrollServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String emailId=request.getParameter("emailId");
		String department=request.getParameter("department");
		String designation=request.getParameter("designation");
		String pancard=request.getParameter("pancard");
		int yearlyInvestmentUnder80C=Integer.parseInt(request.getParameter("yearlyInvestmentUnder80C"));
		
		int basicSalary=Integer.parseInt(request.getParameter("basicSalary"));
		int epf=Integer.parseInt(request.getParameter("epf"));
		int companyPf=Integer.parseInt(request.getParameter("companyPf"));
		
		String bankName=request.getParameter("bankName");
		int accountNumber=Integer.parseInt(request.getParameter("accountNumber"));
		String ifscCode=request.getParameter("ifscCode");
		
		int associateId=services.acceptAssociateDetails(new Associate(yearlyInvestmentUnder80C, firstName, lastName, department, designation, pancard, emailId, new Salary(basicSalary, epf, companyPf), new BankDetails(accountNumber, bankName, ifscCode)));
		
		//Associate associate=services.getAssociateDetails(associateId);
		request.setAttribute("associateId", associateId);
		request.getRequestDispatcher("associateRegistrationsuccess.jsp").forward(request, response);	
	}
	@Override
	public void destroy() 
	{
		services=null;
	}
}