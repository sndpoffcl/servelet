package com.cg.payroll.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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


@WebServlet("/allAssociateDetails")
public class GetAllAssociateDetails extends HttpServlet {
	private PayrollServices services;
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException
	{
		services=new PayrollServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Associate> associates=new ArrayList<Associate>();
		associates=services.getAllAssociatesDetails();
		request.setAttribute("associate", associates);
		request.getRequestDispatcher("allAssociateDetails.jsp").forward(request, response);	
	}
	@Override
	public void destroy() 
	{
		services=null;
	}
}