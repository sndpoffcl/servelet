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


@WebServlet("/associateDetails")
public class GetAssociateDetails extends HttpServlet {
	private PayrollServices services;
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException
	{
		services=new PayrollServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int associateId=Integer.parseInt(request.getParameter("associateId"));

		Associate associate=null;
		try
		{
			associate=services.getAssociateDetails(associateId);
			request.setAttribute("associate", associate);
			request.getRequestDispatcher("associateDetailssuccess.jsp").forward(request, response);	
		}catch (AssociateDetailNotfoundException e) {
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("associateDetailserror.jsp").forward(request, response);	
		}

		
	}
	@Override
	public void destroy() 
	{
		services=null;
	}
}